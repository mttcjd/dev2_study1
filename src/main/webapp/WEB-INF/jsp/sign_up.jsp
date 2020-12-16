<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<c:import url="header.jsp"/>

<div class="wrapper">

<form:form action="/join" method="post">

	<article class="table-set">
		<div class="inner">
			<div class="table-list-tit">회원가입</div>
			<table>
				<colgroup>
					<col style="width:200px;">
					<col style="width:auto;">
				</colgroup>
				<tbody>
				<tr>
					<th>아이디</th>
					<td><input name="user_id" class="tbox"></td>
				</tr>
				<tr>
					<th>비밀번호</th>
					<td><input type="password" name="user_pw" class="tbox"></td>
				</tr>
				<tr>
					<th>기업명</th>
					<td><input name="corp_nm" class="tbox"></td>
				</tr>
				<tr>
					<th>전화번호</th>
					<td><input name="tel_no" class="tbox"></td>
				</tr>
				</tbody>
			</table>
			<div class="table-menu">
				<a href="javascript:history.back()">취소</a>
				<a href="javascript:$('form').submit();">회원가입</a>
			</div>
		</div>
	</article>
</form:form>
</div>


<c:import url="footer.jsp"/>
