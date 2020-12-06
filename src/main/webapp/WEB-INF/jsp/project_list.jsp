<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<c:import url="header.jsp"/>

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
						<th>NO</th>
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
							<td>${item.pjt_status eq '1' ? '대기' : (item.pjt_status eq '2' ? '진행중' : '완료')}</td>
							<td>${fn:substring(item.createdDate,0,10)}</td>
							<td><a href="/project/${item.id}" class="view-btn">상세보기</a></td>
						</tr>
					</c:forEach>
					<c:if test="${empty list}">
						<tr>
							<td colspan="6">등록된 프로젝트가 없습니다.</td>
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
