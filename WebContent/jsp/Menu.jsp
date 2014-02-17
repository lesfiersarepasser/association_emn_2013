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
			<td><a href="<%=getServletContext().getContextPath()%>/jsp/Template.jsp?page=Accueil">Accueil</a></td>
			<td><a href="<%=getServletContext().getContextPath()%>/jsp/Template.jsp?page=Articles">Articles</a></td>
			<td><a href="<%=getServletContext().getContextPath()%>/jsp/Template.jsp?page=Commande">Commande</a></td>
			<td><a href="<%=getServletContext().getContextPath()%>/jsp/Template.jsp?page=Panier">Panier</a></td>
			<td></td>
			<td>Adherent :</td>
		</tr>
	</table>
</body>
</html>