<%-- 
    Document   : index
    Created on : 8 nov. 2024, 20:32:30
    Author     : Leo
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Basic Struts 2 Application - Welcome</title>
    </head>
    <body>
        <h1>Welcome To Struts 2!</h1>
        <p><a href="<s:url action='hello'/>">Hello World</a></p>

        <!-- Enlace con el parámetro userName -->
        <s:url action="hello" var="helloLink">
            <s:param name="userName">Bruce Phillips</s:param>
        </s:url>
        <p><a href="${helloLink}">Hello Bruce Phillips</a></p>

        <p>Get your own personal hello by filling out and submitting this form.</p>

        <s:form action="hello">
            <s:textfield name="userName" label="Your name" />
            <s:submit value="Submit" />
        </s:form>
        
        <!-- Enlace para ir a la página de registro -->
        <p><a href="register.jsp">Please register</a> for our prize drawing.</p>
    </body>
</html>