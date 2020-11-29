<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<meta http-equiv="Content-Type" content="text/html;charset=utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	  content="width=device-width,initial-scale=1.0,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no">
<head>
	<meta charset="UTF-8">
	<title>프로젝트 관리 - 목록</title>
	<link type="text/css" rel="stylesheet" href="../css/reset.css"/>
	<link type="text/css" rel="stylesheet" href="../css/ui.css"/>
	<link type="text/css" rel="stylesheet" href="../css/style.css"/>
</head>
<body>
<div class="container">

	<header>

		<div class="inner">

			<div class="header__menu">
				<nav>
					<ul>
						<li><a href="#none" class="current">프로젝트 관리</a></li>
						<li><a href="#none">프로젝트 등록</a></li>
						<li><a href="#none">담당자 관리</a></li>
					</ul>
				</nav>


				<div class="header_menu__right">
					<a href="/">로그인</a>
					<a href="#none">회원가입</a>

					<a href="#none">로그아웃</a>
				</div>
			</div>

		</div>
	</header>

	<div class="wrapper">


		<article class="table-list">
			<div class="inner">
				<div class="table-list-tit">테이블 타이틀</div>

				<article class="search__form">
					<select>
						<option>프로젝트명</option>
						<option>담당자</option>
					</select>
					<input placeholder="검색어 입력">
					<a href="#none" class="search-btn">검색</a>
				</article>

				<table>
					<thead>
					<tr>
						<th>NOddd</th>
						<th>프로젝트명</th>
						<th>담당자</th>
						<th>상태</th>
						<th>등록일시</th>
						<th>메뉴</th>
					</tr>
					</thead>
					<tbody>
					<c:forEach var="item" items="${list}" varStatus="idx">
						<tr>
							<td>${idx.count}</td>
							<td>${item.pjt_title}</td>
							<td>-</td>
							<td>${item.amount}</td>
							<td>2020-10-02</td>
							<td><a href="#none" class="view-btn">상세보기</a></td>
						</tr>
					</c:forEach>
					<c:if test="${empty list}">
						<tr>
							<td colspan="6">등록된 프로젝트가 없습니다dfdfdf.</td>
						</tr>
					</c:if>
					</tbody>
				</table>
				<article class="paging">
					<ul>
						<li><a href="#none" class="current">1</a></li>
						<li><a href="#none">2</a></li>
						<li><a href="#none">3</a></li>
					</ul>
				</article>
			</div>
		</article>

	</div>



</div>

<script src="../js/jquery-3.1.1.min.js"></script>
<script src="../js/jquery-ui-1.12.1.js"></script>
<script src="../js/ui.js"></script>

</body>
</html>