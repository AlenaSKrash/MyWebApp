<!DOCTYPE html>
<html>
<body>

<h2> All Employees</h2>
<br>

<table>
    <tr>

    <td>Name</td>
    <td>Surname</td>
    <td>Department</td>
    <td>Salary</td>
    <tr/>

    <c:forEach var="emp" items="${allEmps}">
        <c:url var = "updateButton" value ="/updateInfo">
            <c:param name="empId" value ="${emp.id}"/>
        </c:url>
        <c:url var="deleteButton" value="/deleteEmployee">
            <c:param name="empid" value="${emp.id}"/>
        </c:url>
        <tr>

        <td>${emp.name}</td>
        <td>${emp.surname}</td>
        <td>${emp.department}</td>
        <td>${emp.salary}</td>
        <td>
        <input type="button" value="update" onclick="window.location.href = '${updateButton}'"/>
        <input type="button" value="delete" onclick = "window.location.href = '${deleteButton}'"/>
        </td>
        </tr>
    </c:forEach>



</table>
</body>
</html>
