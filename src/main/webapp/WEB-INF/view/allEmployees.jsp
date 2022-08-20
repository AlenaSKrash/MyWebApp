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

    <c:farEach var="emp" items="${allEmps}">

        <tr>

        <td>${emp.name}</td>
        <td>${emp.surname}</td>
        <td>${emp.department}</td>
        <td>${emp.salary}</td>
        </tr>
    </c:farEach>

</table>
</body>
</html>
