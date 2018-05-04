<%@ tag language="java" pageEncoding="UTF-8"%>
<%@taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core'%>
<header style="background-image: url(images/intro.jpg);">
	<div class='vlaglist'>
		<h1>Wereldwijnen</h1>
		<ul>
			<c:forEach items='${landen}' var='land'>
				<c:url value='/index.html' var='indexURL'>
					<c:param name='id' value='${land.id}'/>
				</c:url>
				<li>
					<a href='${indexURL}'><img border="0" alt="${land.naam}" src="images/${land.id}.png"></a>
				</li>
			</c:forEach>
		</ul>
	</div>
</header>
