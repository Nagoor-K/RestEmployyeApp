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
<%response.sendRedirect("/RestEmployeeApp/rest/employee/getall"); %>>
<a href="rest/employee/getall">
        <button class="GetAll">
            Show All Employees
        </button>
   </a>
<br>

</body>
</html>