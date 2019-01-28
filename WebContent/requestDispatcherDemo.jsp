<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		Cookie[] cookie = request.getCookies();
		for (int i = 0; i < cookie.length; i++) {
			String cookieName = cookie[i].getName();
			String cookieValue = cookie[i].getValue();

			if (cookieName.equals("AUTHENTICATE")) {
				if (cookieValue != null) {
					out.println("Welcome :" + cookie[i].getValue());
				} else {
					response.sendRedirect("login.jsp");
				}
			} 
		}
	%>
</body>
</html>