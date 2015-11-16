<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>

<h1>Toma question!</h1>
<c:forEach items="${questions}" var="question">
	<div class="col-sm-6 col-md-3" style="padding-bottom: 15px">
		<div class="thumbnail">
			<div class="caption">
				<h2>${question.questionText}</h2>
			</div>
			<c:forEach items="${question.answers}" var="answer">
				<div class="col-sm-6 col-md-3" style="padding-bottom: 15px">
					<div class="thumbnail">
						<div class="caption">
							<h3>	- ${answer.text}</h3>
						</div>
					</div>
				</div>
			</c:forEach>
		</div>
	</div>
</c:forEach>
</html>