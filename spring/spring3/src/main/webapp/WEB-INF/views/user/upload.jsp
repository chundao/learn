<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>


<sf:form method="POST" modelAttribute="user" enctype="multipart/form-data" action="/spring3/user/uploadBack">

	<table>
		<tr>
			<th><label for="user_name">username:</label></th>
			<td><sf:input path="username" size="15" id="user_name"></sf:input></td>
		</tr>
		<tr>
			<th><label for="user_password">password:</label></th>
			<td><sf:password path="password" size="30" shoPassword="true" id="user_password"></sf:password></td>
		</tr>
		<tr>
			<th><label for="user_email">email:</label></th>
			<td><sf:input path="email" size="30" id="user_email"></sf:input></td>
		</tr>
		
		<tr>
			<th><label for="user_image">image:</label></th>
			<td><input name="image" type="file" id="user_image" ></input></td>
		</tr>
		
		<tr>
			<th></th>
			<td><input type="submit" value="submit"></input></td>
		</tr>
	</table>
	

</sf:form>

${requestScope.user.username}
${requestScope.user.password}
${requestScope.user.email}
${requestScope.image}

