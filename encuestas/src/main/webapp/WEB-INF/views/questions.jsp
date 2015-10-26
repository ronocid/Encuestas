<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>

<h1>Toma question!</h1>
<c:forEach items="${questions}" var="question">
	<div class="col-sm-6 col-md-3" style="padding-bottom: 15px">
		<div class="thumbnail">
			<div class="caption">
				<h3>${question.questionText}</h3>
			</div>
		</div>
	</div>
</c:forEach>
</html>