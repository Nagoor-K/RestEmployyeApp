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
	ServletContext servletcontext = getServletContext();
	Employee emp=(Employee)servletcontext.getAttribute("emp");
	long eid;
	String ename="";
	int eage;
	long esalary;
	if(emp!=null){
		long id=emp.getId();
		if(Long.toString(id)!=null){
			eid=id;
		}
		String name=emp.getName();
		if(name!=null){
			ename=name;
		}
		int age=emp.getAge();
		if(Integer.toString(age)!=null){
			eage=age;
		}
		long salary=emp.getSalary();
		if(Long.toString(salary)!=null){
			esalary=salary;
		}
	}
%>

<input type="text" id="eid" name="eid" value="${not empty eid ? eid: ''}"><br>

<label>Employee Name : </label>

<input type="text" id="name" name="name" value="${not empty ename ? ename: ''}"><br>

<label>Employee Age : </label>

<input type="text" id="age" name="age" value="${not empty eage ? eage: ''}"><br>

<label>Employee Salary : </label>

<input type="text" id="salary" name="salary" value="${not empty esalary ? esalary: ''}"><br>

<input type="submit" value="Submit">

</form>

<a href="/RestEmployeeApp/rest/employee/getall">
        <button class="GetAll">
            GO Back
        </button>
   </a>
</body>
</html>