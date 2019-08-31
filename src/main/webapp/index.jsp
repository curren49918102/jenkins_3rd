<%@ page language="java" contentType="text/html; charset=windows-31j"
    pageEncoding="windows-31j"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=windows-31j">
		<title>Entry Form</title>
	</head>
	<body>
		<h1>Sample Program 0831</h1>
		<form action="./SampleServlet" method="post">
			<label for="LastName">First Name</label>: <input type="text" name="LastName" /><br />
			<label for="FirstName">Last Name</label>: <input type="text" name="FirstName" /><br />
			<input type="hidden" name="action" value="hello" />
			<input type="submit" name="send" value="Submit" />
		</form>
	</body>
</html>
