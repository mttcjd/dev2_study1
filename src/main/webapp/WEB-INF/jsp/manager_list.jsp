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
			<form action="/manager_list" method="get">
			<article class="search__form">
				<select>
					<option selected>담당자</option>
				</select>
				<input name="keyword" placeholder="검색어 입력" value="${keyword}">
				<a href="javascript:$('form').submit()" class="search-btn">검색</a>
			</article>
			</form>
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
				<c:forEach var="item" items="${list.content}" varStatus="idx">
					<tr>
						<td>${idx.count + list.size * list.number}</td>
						<td>${item.manager_name}</td>
						<td>${fn:substring(item.createdDate,0,10)}</td>
						<td><a href="#none" class="view-btn">상세보기</a></td>
					</tr>
				</c:forEach>
				<c:if test="${empty list.content}">
					<tr>
						<td colspan="4">데이터가 없습니다.</td>
					</tr>
				</c:if>
				</tbody>
			</table>
			<article class="paging">
				<ul>
					<c:forEach begin="0" end="${list.totalPages eq 0 ? '0' : list.totalPages - 1}" varStatus="idx">
						<li><a href="/manager_list?page=${idx.index}" class="${list.number eq idx.index? 'current' : ''}">${idx.count}</a></li>
					</c:forEach>
				</ul>
			</article>
		</div>
	</article>

</div>



<c:import url="footer.jsp"/>
