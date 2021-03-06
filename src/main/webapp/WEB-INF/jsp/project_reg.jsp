<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:import url="header.jsp"/>

	<div class="wrapper">


		<article class="table-set">
			<div class="inner">
				<div class="table-list-tit">프로젝트 등록</div>
				<table>
					<colgroup>
						<col style="width:200px;">
						<col style="width:auto;">
					</colgroup>
					<tbody>
					<tr>
						<th>프로젝트명</th>
						<td><input class="tbox" name="pjt_title"></td>
					</tr>
					<tr>
						<th>상위프로젝트 선택</th>
						<td>
							<select>
								<option>선택</option>
							</select>
						</td>
					</tr>
					<tr>
						<th>상태</th>
						<td>
							<select name="pjt_status">
								<option>선택</option>
								<option value="1">대기</option>
								<option value="2">진행중</option>
								<option value="3">완료</option>
							</select>
						</td>
					</tr>
					<tr>
						<th>금액</th>
						<td><input class="tbox" name="amount"></td>
					</tr>
					<tr>
						<th>담당자</th>
						<td>
							<select name="manager_id">
								<c:forEach var="mng" items="${managerList}">
								<option value="${mng.id}">${mng.manager_name}</option>
								</c:forEach>
								<c:if test="${empty managerList}">
								<option disabled>담당자 없음</option>
								</c:if>
							</select>
						</td>
					</tr>
					</tbody>
				</table>
				<div class="table-menu">
					<a href="javascript:history.back()">취소</a>
					<a href="javascript:page.save()">등록</a>
				</div>
			</div>
		</article>

	</div>
<script>
	var page = {
		save : function (){

			var data = {
				user_id : 'test',
				pjt_title : $('input[name=pjt_title]').val(),
				pjt_desc : 'test',
				pjt_status : $('select[name=pjt_status]').val(),
				amount : $('input[name=amount]').val(),
				manager_id : $('select[name=manager_id]').val(),
			}

			$.ajax({
				type: 'POST',
				url: '/project/save',
				dataType: 'json',
				beforeSend : function(xhr){
					xhr.setRequestHeader('${_csrf.headerName}', '${_csrf.token}');
				},
				contentType:'application/json; charset=utf-8',
				data: JSON.stringify(data)
			}).done(function(){
				alert('등록완료');
				location.href='/';
			}).fail(function (error) {
				alert(JSON.stringify(error));
			});



		}
	}
</script>

<c:import url="footer.jsp"/>