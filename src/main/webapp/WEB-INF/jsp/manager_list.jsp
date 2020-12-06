<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<c:import url="header.jsp"/>


<div class="wrapper">


	<article class="table-list">
		<div class="inner">
			<div class="table-list-tit">담당자 관리
				<a href="/manager_reg" class="manager-add-btn">신규 등록</a>
			</div>

			<article class="search__form">
				<select>
					<option selected>담당자</option>
				</select>
				<input placeholder="검색어 입력">
				<a href="#none" class="search-btn">검색</a>
			</article>

			<table>
				<thead>
				<tr>
					<th>NO</th>
					<th>담당자</th>
					<th>등록일시</th>
					<th>메뉴</th>
				</tr>
				</thead>
				<tbody>
				<c:forEach var="item" items="${list}" varStatus="idx">
					<tr>
						<td>${idx.count}</td>
						<td>${item.manager_name}</td>
						<td>${fn:substring(item.createdDate,0,10)}</td>
						<td><a href="#none" class="view-btn">상세보기</a></td>
					</tr>
				</c:forEach>
				<c:if test="${empty list}">
					<tr>
						<td colspan="4">등록된 담당자가 없습니다.</td>
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



<c:import url="footer.jsp"/>
