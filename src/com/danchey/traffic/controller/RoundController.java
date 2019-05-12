package com.danchey.traffic.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.danchey.traffic.controller.advance.NormalAdvanceAttr;
import com.danchey.traffic.controller.advance.RoundAdvanceAttr;
import com.danchey.traffic.pojo.Normalintersection;
import com.danchey.traffic.pojo.Roundabout;
import com.danchey.traffic.service.RoundService;
import com.github.pagehelper.PageInfo;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

@Controller
@RequestMapping(value = "/round")
public class RoundController {

	@Autowired
	private RoundService roundService;

	@RequestMapping(value = "/round.do")
	public String index(Model model, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
		return "infrastructure/roundabout";
	}

	@RequestMapping(value = "/insert.do")
	public @ResponseBody Boolean insert(Roundabout roundabout, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) {
		roundabout.setUpdatetime(new Date());
		roundabout.setCreatetime(new Date());
		roundabout.setCreater("dancey");
		roundService.insert(roundabout);
		return true;
	}

	@RequestMapping(value = "/search.do")
	public @ResponseBody PageInfo search(RoundAdvanceAttr advance, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) {
		PageInfo pageInfo = roundService.selectByAdvance(advance);
		return pageInfo;
	}

	@RequestMapping(value = "/selectById.do")
	public @ResponseBody Roundabout selectById(int id) {
		Roundabout roundabout = roundService.selectByPrimaryKey(id);
		return roundabout;
	}

	@RequestMapping(value = "/delete.do")
	public @ResponseBody Boolean deleteById(int id) {
		int line = roundService.deleteByPrimaryKey(id);
		return true;
	}

	@RequestMapping(value = "/update.do")
	public @ResponseBody Roundabout updateById(Roundabout roundabout) {
		int line = roundService.updata(roundabout);
		return roundabout;
	}

	@RequestMapping(value = "/upload.do")
	public @ResponseBody List<Roundabout> upload(@RequestParam("file") CommonsMultipartFile files,
			HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws IOException {
		String sourceName = files.getOriginalFilename(); // 原始文件名
		String fileType = sourceName.substring(sourceName.lastIndexOf("."));
//		上传文件到upload
		String base = httpServletRequest.getSession().getServletContext().getRealPath("/upload//");
		File file = new File(base);
		if (!file.exists()) {
			file.mkdirs();
		}
		String path = base + File.separator + sourceName;
		File upload = new File(path);
		files.transferTo(upload);

		return null;
	}

	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
	}

}
