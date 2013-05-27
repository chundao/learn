<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>


<sf:form method="POST" modelAttribute="user" action="htp://localhost/hello/registerBack.htm">

	<table cellspaceing="0">
		<tr>
			<th><label for="user_name">username:</label></th>
			<td><sf:input path="username" size="15" id="user_name"></sf:input></td>
		</tr>
		<tr>
			<th><label for="user_password">password:</label></th>
			<td><sf:password path="username" size="30" shoPassword="true" id="user_password"></sf:password></td>
		</tr>
		<tr>
			<th><label for="user_email">email:</label></th>
			<td><sf:input path="email" size="30" id="user_email"></sf:input></td>
		</tr>
		
		<tr>
			<th></th>
			<td><input type="button" name="submit" value="submit"></input></td>
		</tr>
	</table>
	

</sf:form>