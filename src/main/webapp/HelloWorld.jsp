<%-- 
    Document   : HelloWorld
    Created on : 13 nov. 2024, 20:06:30
    Author     : Leo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hello world !!!</title>
    </head>
    <body>
       <h2><s:property value="messageStore.message" /></h2>
       <p>USTED HA INGRESADO: <s:property value="helloCount" /> </p>
       <p><s:property value="messageStore" /> </p>
       <p><a href="<s:url action='index'/>">Home Page</a></p>
    </body>
</html>
