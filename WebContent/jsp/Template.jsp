<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
<tr>
<td class="menu"><jsp:include page="/jsp/Menu.jsp" /></td>
</tr>
<tr>
			<td class="page">
				<%if(request.getParameter("page")!=null) {%> <jsp:include
					page='<%= "/jsp/"+  request.getParameter("page")+".jsp" %>' /> <%}else{ %>
				<jsp:include page="/jsp/Accueil.jsp" /> <%} %>
			</td>
			</tr>
</table>
</body>
</html>