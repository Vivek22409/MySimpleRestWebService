<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title></title>
</head>
<body>
<center><h2>The below is the list of cities for  state: </h2></center>
	<table align="center">
		<c:forEach items="${cities}" var="element">
			<tr>
				<td>${element.name}</td>
			</tr>
		</c:forEach>
	</table>
	
</body>
</html>