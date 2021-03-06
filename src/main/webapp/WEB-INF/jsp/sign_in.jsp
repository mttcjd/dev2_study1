<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<c:import url="header.jsp"/>

<div class="wrapper">
<form:form action="/login" method="post">

	<!-- 수동으로 세팅 -->
	<%--<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>--%>

	<article class="table-set">
		<div class="inner">
			<div class="table-list-tit">로그인</div>
			<table>
				<colgroup>
					<col style="width:200px;">
					<col style="width:auto;">
				</colgroup>
				<tbody>
				<tr>
					<th>아이디</th>
					<td><input name="username" class="tbox"></td>
				</tr>
				<tr>
					<th>비밀번호</th>
					<td><input type="password" name="password" class="tbox"></td>
				</tr>
				</tbody>
			</table>
				${not empty msg ? msg : ''}
			<div class="table-menu">
				<a href="javascript:history.back()">취소</a>
				<a href="javascript:$('form').submit();">로그인</a>
			</div>
		</div>
	</article>

</form:form>

</div>


<c:import url="footer.jsp"/>
