<%@ tag language="java" pageEncoding="UTF-8"%>
<%@taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core'%>

<div class="soortlijst">
	<c:if test='${not empty param and not empty landen}'>
		<h1>Wijnen uit ${landen[param.id-1].naam}</h1>
	</c:if>
</div>