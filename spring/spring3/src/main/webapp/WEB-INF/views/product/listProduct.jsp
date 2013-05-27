<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<title>Product List</title>
<meta name="Generator" content="EditPlus">
<meta name="Author" content="">
<meta name="Keywords" content="">
<meta name="Description" content="">
</head>

<body>

	<div>Product List</div>

	<div>
		<table>
			<tr>
				<td>名称</td>
				<td>描述</td>
				<td>价格</td>
				<td>库存</td>
			</tr>
		<c:forEach var="product" items="${productList}" >
			<tr>
				<td>${product.name}</td>
				<td>description: ${product.description}</td> 
				<td>price: ${product.price}</td>
				<td>stock: ${product.stock}</td>
			</tr>	
		</c:forEach>
		</table>
	</div>

</body>

</html>



