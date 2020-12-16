<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<c:import url="header.jsp"/>


<div class="wrapper">

	<article class="table-set">
		<div class="inner">
			<div class="table-list-tit">담당자 등록</div>
			<table>
				<colgroup>
					<col style="width:200px;">
					<col style="width:auto;">
				</colgroup>
				<tbody>
				<tr>
					<th>담당자명</th>
					<td><input class="tbox" name="manager_name"></td>
				</tr>
				<tr>
					<th>전화번호</th>
					<td><input class="tbox" name="manager_tel"></td>
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
				user_id : '<sec:authentication property="name" />',
				manager_name : $('input[name=manager_name]').val(),
				manager_tel : $('input[name=manager_tel]').val(),
			}

			$.ajax({
				type: 'POST',
				url: '/manager/save',
				dataType: 'json',
				beforeSend : function(xhr){
					xhr.setRequestHeader('${_csrf.headerName}', '${_csrf.token}');
				},
				contentType:'application/json; charset=utf-8',
				data: JSON.stringify(data)
			}).done(function(){
				alert('등록완료');
				location.href='/manager_list';
			}).fail(function (error) {
				alert(JSON.stringify(error));
			});



		}
	}
</script>

<c:import url="footer.jsp"/>
