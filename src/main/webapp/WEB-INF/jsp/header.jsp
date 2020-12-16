<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<c:set var="path" value="${requestScope['javax.servlet.forward.servlet_path']}"/>
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
						<sec:authorize access="hasAnyRole('ADMIN','MEMBER')">
						<li><a href="/" class="${path eq '/' ? 'current' : ''}">프로젝트 관리</a></li>
						<li><a href="/project_reg" class="${path eq '/project_reg' ? 'current' : ''}">프로젝트 등록</a></li>
						<li><a href="/manager_list" class="${path eq '/manager_list' ? 'current' : ''}">담당자 관리</a></li>
						</sec:authorize>
					</ul>
				</nav>
				<div class="header_menu__right">
					<sec:authorize access="isAnonymous()">
						<a href="/sign_in">로그인</a>
						<a href="/sign_up">회원가입</a>
					</sec:authorize>

					<sec:authorize access="isAuthenticated()">
						<sec:authentication property="name" /> 님
						<sec:authorize access="hasRole('ADMIN')">(관리자)</sec:authorize>
						<sec:authorize access="hasRole('MEMBER')">(사용자)</sec:authorize>
						<a href="/logout">로그아웃</a>
					</sec:authorize>
				</div>
			</div>
		</div>
	</header>
