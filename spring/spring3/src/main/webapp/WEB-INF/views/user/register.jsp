<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>


<sf:form method="POST" modelAttribute="user" action="htp://localhost/hello/registerBack.htm">

	<table cellspaceing="0">
		<tr>
			<th><label for="user_name">username:</label></th>
<<<<<<< HEAD
			<td>
				<sf:input path="username" size="15" id="user_name"></sf:input><br/>
				<sf:errors path="username"></sf:errors>
			</td>
		</tr>
		<tr>
			<th><label for="user_password">password:</label></th>
			<td>
				<sf:password path="password" size="30" shoPassword="true" id="user_password"></sf:password><br/>
				<sf:errors path="password"></sf:errors>
			</td>
		</tr>
		<tr>
			<th><label for="user_email">email:</label></th>
			<td>
				<sf:input path="email" size="30" id="user_email"></sf:input><br/>
				<sf:errors path="email"></sf:errors>
			</td>
=======
			<td><sf:input path="username" size="15" id="user_name"></sf:input></td>
		</tr>
		<tr>
			<th><label for="user_password">password:</label></th>
			<td><sf:password path="username" size="30" shoPassword="true" id="user_password"></sf:password></td>
		</tr>
		<tr>
			<th><label for="user_email">email:</label></th>
			<td><sf:input path="email" size="30" id="user_email"></sf:input></td>
>>>>>>> 20cf962c428e23dd472e0659c60e5da1c9e50a4a
		</tr>
		
		<tr>
			<th></th>
			<td><input type="button" name="submit" value="submit"></input></td>
		</tr>
	</table>
	

</sf:form>