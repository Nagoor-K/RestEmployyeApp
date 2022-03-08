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
<h2>Add Employee </h2>
<label>Employee Id : </label><%
   Employee emp=(Employee)request.getAttribute("emp");
	System.out.println(emp.toString());
%>

<input type="text" id="eid" name="eid"><br>
<label>Employee Name : </label>
<input type="text" id="name" name="name"><br>
<label>Employee Age : </label>
<input type="text" id="age" name="age"><br>
<label>Employee Salary : </label>
<input type="text" id="salary" name="salary"><br>

<input type="submit" value="Submit">

</form>

<a href="/RestEmployeeApp/rest/employee/getall">
        <button class="GetAll">
            Show All Employees
        </button>
   </a>
</body>
</html>