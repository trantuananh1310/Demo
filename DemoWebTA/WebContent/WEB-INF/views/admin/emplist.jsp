<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Panelo - Free Admin Template</title>
<link rel="stylesheet" type="text/css" href="style.css" />
<link href='http://fonts.googleapis.com/css?family=Belgrano' rel='stylesheet' type='text/css'>
<!-- jQuery file -->
<script src="admin/js/jquery.min.js"></script>
<script src="admin/js/jquery.tabify.js" type="text/javascript" charset="utf-8"></script>
<script type="text/javascript">

</script>
</head>
<body>
                    
<table border=1>
    	<tr>
            <th>Name</th>
            <th>Email</th>
            <th>Company</th>
        </tr>
	    <c:forEach var="m" items="${list }" varStatus="stt">
	    	<tr class="${stt.index % 2==0 ? 'even' : 'odd'}">
	            <td><a href="editEmp?id=${m.id }">${m.name}</a></td>
	            <td>${m.email}</td>
	            <td>${m.company.name}</td>
	        </tr>
   	    </c:forEach>
</table>
</body>
</html>