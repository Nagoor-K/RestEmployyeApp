<%@ page import="com.nagoor.model.Employee" %>
<html>

<head><style>
        .GetAll {
            background-color: white;
            border: 2px solid black;
            color: green;
            padding: 5px 10px;
            text-align: center;
            display: inline-block;
            font-size: 20px;
            margin: 10px 30px;
            cursor: pointer;
        }
    </style></head>
<body>
<form action="rest/employee/addEmployee" method="post">
<h2>Add Employee Details</h2>
<table style="with: 50%">
	<tr>
			<td>Employee Id : </td>
			<td><input type="text" id="eid" name="eid" /></td>
	</tr>
	<tr>
			<td>Employee Name : </td>
			<td><input type="text" id="name" name="name" /></td>
	</tr>
	<tr>
			<td>Employee Age : </td>
			<td><input type="text" id="age" name="age" /></td>
	</tr>
	<tr>
			<td>Employee Salary : </td>
			<td><input type="text" id="salary" name="salary" /></td>
	</tr>
	
</table>

<input type="submit" class="GetAll" value="Submit">

</form>

<a href="/RestEmployeeApp/">
        <button class="GetAll">
            GO Back
        </button>
   </a>
</body>
</html>