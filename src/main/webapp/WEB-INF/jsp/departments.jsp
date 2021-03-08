<head>
<meta charset="ISO-8859-1">
<title>Employee</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

<!-- <link href="${contextPath}/resource/bootstrap.min.css" rel="stylesheet"> -->
</head>
<body>
<div class="container">

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

</div>
</body>
</html>
