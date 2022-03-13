<%@ page import="com.nagoor.service.EmployeeService" %>
<%@ page import="com.nagoor.model.Employee" %>
<%@ page import="java.util.*" %>
<%@ page import="com.google.inject.Guice" %>
<%@ page import="com.google.inject.Injector" %>
<%@ page import="com.nagoor.model.module.PersistenceModule" %>
<%@ page import="com.nagoor.servlets.GetAll" %>
<%@ page import="com.google.inject.Inject" %>
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

<h1>REST EASY DEMO APPLICATION</h1>
<table border="2">
   <tr>
        <td>Employee Id</td>
        <td>Name</td>
        <td>Age</td>
        <td>Salary</td>
        <td>Update Employee</td>
   </tr>
   <%
   try{
	   

	   
	   for(Employee emp: (List<Employee>) request.getAttribute("emps")){%>
	   	<tr>      
            <td><%=emp.getId()%></td><td><%=emp.getName()%></td><td><%=emp.getAge()%></td><td><%=emp.getSalary()%></td><td><a href='/RestEmployeeApp/addemployee.jsp'> Edit Employee</a></td>
        </tr>
		   
	   <%}
   }
   catch(Exception e){
	   
   }
   %>
   
   
</table>
<a href="/RestEmployeeApp/addemployee.jsp">
        <button class="GetAll">
            Add Employee
        </button>
   </a>
<br>

</body>
</html>