<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<div class="sidebar">
	<nav class="sidebar-nav">
		<ul class="nav">
			<li class="nav-title">菜单</li>

			<li class="nav-item"><a href="${pageContext.request.contextPath }/index.do"
				class="nav-link active"> <i id='noc' class="icon icon-speedometer"></i>
					数据概览
			</a></li>

			<!-- 道路基础设施调查 -->
			<li class="nav-item nav-dropdown"><a href="#"
				class="nav-link nav-dropdown-toggle"> <i id='noc'
					class="icon icon-target"></i> 道路基础设施调查 <i id='noc' class="fa fa-caret-left"></i>
			</a>

				<ul class="nav-dropdown-items">
					<li class="nav-item"><a href="${pageContext.request.contextPath }/infra/roadstate.do"
						class="nav-link"> <i id='noc' class="icon icon-map"></i> <small>道路现状调查</small>
					</a></li>

					<li class="nav-item"><a href="${pageContext.request.contextPath }/intersection/normal.do"
						class="nav-link"> <i id='noc' class="icon icon-size-actual"></i> <small>常规交叉路口调查</small>
					</a></li>

					<li class="nav-item"><a href="${pageContext.request.contextPath }/round/round.do"
						class="nav-link"> <i id='noc' class="icon icon-support"></i> <small>环形交叉路口调查</small>
					</a></li>

					<li class="nav-item"><a href="${pageContext.request.contextPath }/overpass/overpass.do"
						class="nav-link"> <i id='noc' class="icon icon-shuffle"></i> <small>立体交叉路口调查</small>
					</a></li>

					<li class="nav-item"><a href="${pageContext.request.contextPath }/park/park.do"
						class="nav-link"> <i id='noc' class="icon icon-direction"></i> <small>车辆停放设施调查</small>
					</a></li>
					
					<li class="nav-item"><a href="${pageContext.request.contextPath }/people/people.do"
						class="nav-link"><i id="noc" class="icon icon-graph"></i> <small>常规交叉口行人交通量调查</small>
					</a></li>

				</ul></li>

		</ul>
	</nav>
</div>
