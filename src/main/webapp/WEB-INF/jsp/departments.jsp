<head>
<meta charset="ISO-8859-1">

<%@ include file="header.jsp" %>

<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<form method="POST">
    Nr: <input name="deptNo" value="${department.deptNo}"/><br/>
    Name: <input name="deptName" value="${department.deptName}"/><br/>
    <input type="submit" value="Save"/>
</form>
<table class="table">
  <thead class="thead-dark">
  <tr>

    <th>Dept number</th><th>Dept name</th>
  </tr>
  </thead>
  <tbody>
  <c:forEach items="${departments}" var = "department">
    <tr>
      <td><c:out value = "${department.deptNo}"/></td>
      <td><c:out value = "${department.deptName}"/></td>
    </tr>
  </c:forEach>
  </tbody>
</table>

<%@ include file = "footer.jsp" %>
