package com.danchey.traffic.controller;


import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FileUtils;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.danchey.traffic.pojo.Roadstate;

@Controller
@RequestMapping(value = "/download")
public class DownloadController {
	@RequestMapping(value = "/file.do")
	public ResponseEntity<byte[]> download(HttpServletRequest request, @RequestParam(value="fileName",required = false) String fileName) throws Exception {
	    try{
	        //下载路径
	        String path = "D:\\workspace\\java\\Traffic-information-management-system-TIMS-\\static\\file\\";
	        File file = new File(path + fileName);
	        HttpHeaders headers = new HttpHeaders();
	        //解决文件名中文乱码问题
	        String downloadFileName = new String(fileName.getBytes("UTF-8"),"iso-8859-1");
	        //告诉浏览器以"attachment"方式打开文件
	        headers.setContentDispositionFormData("attachment",downloadFileName);
	        headers.setContentType(MediaType.TEXT_EVENT_STREAM);
	        return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file),headers,HttpStatus.CREATED);
	    } catch(Exception e){
	        e.printStackTrace();
	        System.out.println("文件下载出错...");
	        return null;
	    }
	}
	
	@RequestMapping(value = "/get.do")
	public @ResponseBody Roadstate Index(Model model,HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
		Roadstate roadstate = new Roadstate();
		roadstate.setCreater("asad");
		
		return roadstate;
	}
	
}
