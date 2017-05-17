<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!--  adding jstl core library -->
    <!-- fix the "can not find the library descriptor for ...../core, adding jstl dependency to pom.xml -->
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <!-- from tomcat jndi test code file -->
    <%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
Hi, no spring mvc
<!-- adding data to the session: adding data to controller, then update the .jsp file -->
Session id:<%= session.getAttribute("id") %><p/>
Request: id:<%= request.getAttribute("id") %><p/>
<!--  use expression language  -->
Request (using EL): ${id} <p/><!-- should keep spaces between } and <p/> otherwise error reports -->
<!--  jtsl -->
<c:out value="${id}"></c:out><p/>
<!-- paste the sql query from tomcat jndi site for testing, update dataSource to match previous content in server -->
<!-- update the query to test the connection of mysql -->
<!--  book is the table name -->
<sql:query var="rs" dataSource="jdbc/spring">
select id, name, no from book
</sql:query>

<c:forEach var="row" items="${porject}">
    ID: ${row.id}<br/>
    Name: ${row.name}<br/>
    No: ${row.no}<br/>
</c:forEach>

</body>
</html>