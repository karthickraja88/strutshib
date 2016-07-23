<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<s:form action="save" method="post">
		<s:textfield label="Name" name="user" />
		<s:textfield label="Register No" name="regn" />
		<s:radio list="{'Male','Female'}" label="Gender" name="gen" />
		<s:select list="{'CSE','MECH','CIVIL'}" label="Department"
			name="dept" />
		<s:textarea label="Address" name="addr" />
		<s:submit value="Register" />
	</s:form>

</body>
</html>