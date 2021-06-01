<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
   #admin_body{
      position:absolute;
      width:75%;
      margin-left:5%;
      margin-right:5%;
      background:#fff;
      float: left;
      top:150px;
      left: 250px;
      
   }
   #admin_body>h2{
   margin-bottom:50px;
   }
   .table {
      border-collapse: collapse;
      border-top: 3px solid #383838;
      width:100%;
      text-align: center;
      margin: 0 auto;
    }  
    .table th {
      color: #383838;
      background: #fff;
      text-align: center;
      font-size: 12px;
    }
    .table th, .table td {
      padding: 10px;
      border: 1px solid #ddd;
      font-size: 10px;
    }
    .table th:first-child, .table td:first-child {
      border-left: 0;
    }
    .table th:first-child, .table td:nth-of-type(3) {
      text-align:left;
      border-left: 0;
    }
    .table th:last-child, .table td:last-child {
      border-right: 0;
    }
    .table tr td:first-child{
      text-align: center;
    }
</style>

</head>
<body>
<%@include file="include/admin_header.jsp" %>
<div id="admin_body">
	<div style="width: 400px; height:auto; margin: 0 auto; padding-top:200px; padding-bottom:100px; text-align: center;">
		<img src="/img/logo.png" style="margin: 0 auto;">	
		<h1 style="margin-top:50px;">관리자 페이지입니다.</h1>
		<h1 style="margin-top:20px;">환영합니다:)</h1>
	</div>
</div>	
</body>
</html>