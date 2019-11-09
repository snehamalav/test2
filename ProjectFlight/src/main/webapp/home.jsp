<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>

		<div>
				<form action ="Ser" method="get">
				<br>
				<br>
				SOURCE
				<select name="Source">
				        <option value="null">select</option>
				        <option value="GOA"> GOA </option>
				  		<option value="BOM">BOMBAY</option>
				  		<option value="DEL">DELHI</option>
				 		<option value="DU">DUBAI</option>
				 		<option value="US">USA</option>
				</select>
				<br>
				<br>
				DESTINATION
			
				<select name="Destination">
				        <option value="null">select</option>
				        <OPTION VALUE="BOM"> BOM </OPTION>
				  		<option value="GOA">GOA</option>
				  		<option value="UK">UK</option>
				 		<option value="JP">JAIPUR</option>
				 		<option value="HY">HYDERABAD</option>
				</select>
				<ber>
				<pre>
		 <input type="submit" value="search">
				</pre>	
				</form> 


 		</div>

</center>
 		 
</body>
</html>