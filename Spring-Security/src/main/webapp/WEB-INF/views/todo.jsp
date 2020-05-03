<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Todos for ${name}</title>
<link href="webjars/bootstrap/4.4.1/css/bootstrap.min.css"
    rel="stylesheet">
</head>
<body>

<div class="container">
		<%@ include file="commons/header.jspf"%>
<%@ include file="commons/navigation.jspf"%>
		<form:form method="post" commandName="todo">
			<form:hidden path="id"/>
			<fieldset class="form-group">
				<form:label path="desc">Domain description</form:label>
				<form:input path="desc" type="text" class="form-control"
					required="required"/>
				<form:errors path="desc" cssClass="text-warning" />
			</fieldset>
			<fieldset class="form-group">
                <form:label path="targetDate">Target Date</form:label>
                <form:input path="targetDate" type="text" class="form-control"
                    required="required" />
                <form:errors path="targetDate" cssClass="text-warning" />
            </fieldset>
			<button type="submit" class="btn btn-success">Submit</button>
		</form:form>
	</div>
	<%@ include file="commons/footer.jspf"%>

<script>
	$('#targetDate').datepicker({
		format : 'dd/mm/yyyy'
	});
</script>