<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<%@ include file="/WEB-INF/include/include-header.jspf" %>
</head>


<body>
<h2>게시판 목록</h2>
	<table class="board_list">
	    <colgroup>
	        <col width="10%"/>
	        <col width="*"/>
	        <col width="15%"/>
	        <col width="20%"/>
	    </colgroup>
	    <thead>
	        <tr>
	            <th scope="col">글번호</th>
	            <th scope="col">제목</th>
	            <th scope="col">조회수</th>
	            <th scope="col">작성일</th>
	        </tr>
	    </thead>	    
	    <tbody>
	        <c:choose>
	            <c:when test="${fn:length(list) > 0}">
	                <c:forEach var="row" items="${list}" >
	                    <tr>
	                        <td>${row.idx}</td>
	                        <td>${row.title}</td>
	                        <td>${row.hit_cnt}</td>
	                        <td>${row.created_dt}</td>
	                        
	                    </tr>
	                </c:forEach>
	            </c:when>
	            <c:otherwise>
	                <tr>
	                    <td colspan="4">조회된 결과가 없습니다.</td>
	                </tr>
	            </c:otherwise>
	        </c:choose>
	    </tbody>
	    
	</table>
	<%@ include file="/WEB-INF/include/include-body.jspf" %>
	<script type="text/javascript">
	    $(document).ready(function(){
	        $("#list").on("click", function(e){
	            e.preventDefault();
	            fn_openBoardList();
	        });    
	    });
	     
	    function fn_openBoardList(){
	        var comSubmit = new ComSubmit();
	        comSubmit.setUrl("<c:url value='/sample/openBoardList' />");
	        comSubmit.submit();
	    }
	</script>	
</body>
</html>