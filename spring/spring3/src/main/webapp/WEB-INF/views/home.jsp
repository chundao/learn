<%@ page language="java" import="java.util.*" %>
<%@ page language="java" import="com.chundao.crow.core.entity.Student" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<div>
  <h2>A global community of friends and strangers spitting out their 
  inner-most and personal thoughts on the web for everyone else to 
  see.</h2>
  <h3>Look at what these people are spitting right now...</h3>

  <ol class="spittle-list">
	
    <c:forEach var="crow" items="${crows}" varStatus="status"> 
    	${crow.id} ${crow.name} ${crow.gender} ${crow.address} <br/>
    </c:forEach>
    
     
  </ol>
</div>
