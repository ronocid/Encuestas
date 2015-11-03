<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<link rel="stylesheet"href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
		<title>Questions</title>
	</head>
	<body>
		<section>
			<div class="jumbotron">
				<div class="container">
					<h1>Question</h1>
					<p>Add Question</p>
				</div>
			</div>
			</section>
			<section class="container">
				<form:form modelAttribute="newQuestion" class="form-horizontal">
					<fieldset>
					<legend>Add new Question</legend>
					<div class="form-group">
						<label class="control-label col-lg-2 col-lg-2" for="nombre">Texto pregunta:</label>
						<div class="col-lg-10">
							<form:input id="nombre" path="questionText" type="text" class="form:input-large"/>
						</div>
					</div>
					
					<div class="form-group">
						<div class="col-lg-offset-2 col-lg-10">
							<input type="submit" id="btnAdd" class="btn btn-primary" value ="Add"/>
						</div>
						</div>
					</fieldset>
				</form:form>
			</section>
	</body>
</html>