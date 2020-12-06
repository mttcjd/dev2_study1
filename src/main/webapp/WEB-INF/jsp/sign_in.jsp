<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:import url="header.jsp"/>

<div class="wrapper">


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
					<td><input class="tbox"></td>
				</tr>
				<tr>
					<th>비밀번호</th>
					<td><input class="tbox"></td>
				</tr>
				</tbody>
			</table>
			<div class="table-menu">
				<a href="javascript:history.back()">취소</a>
				<a href="#none">로그인</a>
			</div>
		</div>
	</article>

</div>



<c:import url="footer.jsp"/>
