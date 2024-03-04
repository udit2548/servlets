<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Jsp Application Demo</title>
</head>
<body>
<h1>JSP web to generate dynamic response!</h1>
<%-- Directive tag --> used for import statements --%>
<%@ 
  page import="java.util.Date"
%>

<%-- Declaration tag --> used to declare variables and methods (code outside the body of service method  --%>
<%!
  int a=10;
  
%>

<%-- Scriptlet tag --> whatever code written in this tag, will be considered as the code written in service()
    method
    --%>
<%
String name=request.getParameter("uname");
String ucity=request.getParameter("ucity");
	out.println("Hello "+ name); // Implicit objects
	//out.println(" I know you're from "+ucity); 
	Date date=new Date();
%>

<%-- Expression tag --> print output stream to the console (variable values, strings etc etc)--%>
<h1><%=date%></h1>
<h1><%=ucity %></h1>
</body>
</html>