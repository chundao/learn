<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<sf:form method="POST" modelAttribute="user" enctype="multipart/form-data" action="http://localhost/spring3/uploadFileBack.htm">
	
	username:<sf:input path="username" size="15" id="user_name"></sf:input><br/>
	password:<sf:password path="password" size="30" shoPassword="true" id="user_password"></sf:password><br/>
	email:<sf:input path="email" size="30" id="user_email"></sf:input><br/>
	
	File:<input name="image" type="file" />
	<br/>
	<input type="submit" value="submit" />

</sf:form>


${requestScope.msg}

