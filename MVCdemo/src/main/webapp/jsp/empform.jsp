<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Registration Form</title>
<style>
.error {
	color: #ff0000;
	font-style: italic;
	font-weight: bold;
}
</style>
</head>
<body>
<div align="center">
<h2>Employee Registration</h2>
<form:form action="/empwebcontrol/empp" method="post" modelAttribute="employee">
<form:label path="empid">Emp id:</form:label>
<form:input path="empid"/><br/>
<form:label path="empName">Emp name:</form:label>
<form:input path="empName"/><br/>
<form:errors path="empName" cssClass="error"/> <br/>
<form:label path="empSalary">Emp Salary:</form:label>
<form:input path="empSalary"/><br/>
<form:errors path="empSalary" cssClass="error"/> <br/>
<form:label path="joindate">Joining Date (yyyy-mm-dd):</form:label>
<form:input path="joindate"/><br/>
<form:errors path="joindate" cssClass="error"/> <br/>

<form:label path="empSalary">Emp Salary:</form:label>

<form:button>RegisterEmp</form:button>
</form:form>
</div>
</body>
</html>