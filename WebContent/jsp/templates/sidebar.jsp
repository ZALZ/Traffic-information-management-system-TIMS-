<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<div class="sidebar">
	<nav class="sidebar-nav">
		<ul class="nav">
			<li class="nav-title">菜单</li>

			<li class="nav-item"><a href="${pageContext.request.contextPath }/index.jsp"
				class="nav-link active"> <i class="icon icon-speedometer"></i>
					数据概览
			</a></li>

			<!-- 道路基础设施调查 -->
			<li class="nav-item nav-dropdown"><a href="#"
				class="nav-link nav-dropdown-toggle"> <i
					class="icon icon-target"></i> 道路基础设施调查 <i class="fa fa-caret-left"></i>
			</a>

				<ul class="nav-dropdown-items">
					<li class="nav-item"><a href="${pageContext.request.contextPath }/roadstate.do"
						class="nav-link"> <i class="icon icon-map"></i> <small>道路现状调查</small>
					</a></li>

					<li class="nav-item"><a href="layouts-normal.html"
						class="nav-link"> <i class="icon icon-size-actual"></i> <small>常规交叉口现状调查</small>
					</a></li>

					<li class="nav-item"><a href="layouts-normal.html"
						class="nav-link"> <i class="icon icon-support"></i> <small>环形交叉路路口调查</small>
					</a></li>

					<li class="nav-item"><a href="layouts-normal.html"
						class="nav-link"> <i class="icon icon-shuffle"></i> <small>立体交叉路口调查</small>
					</a></li>

					<li class="nav-item"><a href="layouts-normal.html"
						class="nav-link"> <i class="icon icon-direction"></i> <small>车辆停放设施调查</small>
					</a></li>

				</ul></li>


			<!-- 道路流量调查菜单 -->
			<li class="nav-item nav-dropdown"><a href="#"
				class="nav-link nav-dropdown-toggle"> <i
					class="icon icon-target"></i> 道路流量调查 <i class="fa fa-caret-left"></i>
			</a>

				<ul class="nav-dropdown-items">
					<li class="nav-item"><a href="layouts-normal.html"
						class="nav-link"> <i class="icon icon-target"></i> <small>常规交叉口机动车交通量调查</small>
					</a></li>

					<li class="nav-item"><a href="layouts-normal.html"
						class="nav-link"> <i class="icon icon-target"></i> <small>常规交叉口行人交通量调查</small>
					</a></li>

					<li class="nav-item"><a href="layouts-normal.html"
						class="nav-link"> <i class="icon icon-target"></i> <small>环形交叉口机动车交通量调查</small>
					</a></li>

					<li class="nav-item"><a href="layouts-normal.html"
						class="nav-link"> <i class="icon icon-target"></i> <small>路段机动车交通量调查</small>
					</a></li>
				</ul></li>



			<!-- 道路交通管理调查 -->
			<li class="nav-item nav-dropdown"><a href="#"
				class="nav-link nav-dropdown-toggle"> <i
					class="icon icon-target"></i> 道路交通管理调查 <i class="fa fa-caret-left"></i>
			</a>

				<ul class="nav-dropdown-items">
					<li class="nav-item"><a href="layouts-normal.html"
						class="nav-link"> <i class="icon icon-target"></i> <small>常规道路交通管理调查</small>
					</a></li>

					<li class="nav-item"><a href="layouts-normal.html"
						class="nav-link"> <i class="icon icon-target"></i> <small>常规交叉口行人交通量调查</small>
					</a></li>

					<li class="nav-item"><a href="layouts-normal.html"
						class="nav-link"> <i class="icon icon-target"></i> <small>环形交叉口机动车交通量调查</small>
					</a></li>

					<li class="nav-item"><a href="layouts-normal.html"
						class="nav-link"> <i class="icon icon-target"></i> <small>路段机动车交通量调查</small>
					</a></li>

				</ul></li>


			<li class="nav-item nav-dropdown"><a href="#"
				class="nav-link nav-dropdown-toggle"> <i
					class="icon icon-energy"></i> UI Kits <i class="fa fa-caret-left"></i>
			</a>

				<ul class="nav-dropdown-items">
					<li class="nav-item"><a href="alerts.html" class="nav-link">
							<i class="icon icon-energy"></i> Alerts
					</a></li>

					<li class="nav-item"><a href="buttons.html" class="nav-link">
							<i class="icon icon-energy"></i> Buttons
					</a></li>

					<li class="nav-item"><a href="cards.html" class="nav-link">
							<i class="icon icon-energy"></i> Cards
					</a></li>

					<li class="nav-item"><a href="modals.html" class="nav-link">
							<i class="icon icon-energy"></i> Modals
					</a></li>

					<li class="nav-item"><a href="tabs.html" class="nav-link">
							<i class="icon icon-energy"></i> Tabs
					</a></li>

					<li class="nav-item"><a href="progress-bars.html"
						class="nav-link"> <i class="icon icon-energy"></i> Progress
							Bars
					</a></li>

					<li class="nav-item"><a href="widgets.html" class="nav-link">
							<i class="icon icon-energy"></i> Widgets
					</a></li>
				</ul></li>

			<!-- 道路交通管理调查 -->
			<li class="nav-item nav-dropdown"><a href="#"
				class="nav-link nav-dropdown-toggle"> <i class="icon icon-graph"></i>
					Charts <i class="fa fa-caret-left"></i>
			</a>

				<ul class="nav-dropdown-items">
					<li class="nav-item"><a href="chartjs.html" class="nav-link">
							<i class="icon icon-graph"></i> Chart.js
					</a></li>
				</ul></li>


			<li class="nav-item"><a href="forms.html" class="nav-link">
					<i class="icon icon-puzzle"></i> Forms
			</a></li>

			<li class="nav-item"><a href="tables.html" class="nav-link">
					<i class="icon icon-grid"></i> Tables
			</a></li>

			<li class="nav-title">More</li>

			<li class="nav-item nav-dropdown"><a href="#"
				class="nav-link nav-dropdown-toggle"> <i
					class="icon icon-umbrella"></i> Pages <i class="fa fa-caret-left"></i>
			</a>

				<ul class="nav-dropdown-items">
					<li class="nav-item"><a href="blank.html" class="nav-link">
							<i class="icon icon-umbrella"></i> Blank Page
					</a></li>

					<li class="nav-item"><a href="login.html" class="nav-link">
							<i class="icon icon-umbrella"></i> Login
					</a></li>

					<li class="nav-item"><a href="register.html" class="nav-link">
							<i class="icon icon-umbrella"></i> Register
					</a></li>

					<li class="nav-item"><a href="invoice.html" class="nav-link">
							<i class="icon icon-umbrella"></i> Invoice
					</a></li>

					<li class="nav-item"><a href="404.html" class="nav-link">
							<i class="icon icon-umbrella"></i> 404
					</a></li>

					<li class="nav-item"><a href="500.html" class="nav-link">
							<i class="icon icon-umbrella"></i> 500
					</a></li>

					<li class="nav-item"><a href="settings.html" class="nav-link">
							<i class="icon icon-umbrella"></i> Settings
					</a></li>
				</ul></li>
		</ul>
	</nav>
</div>
