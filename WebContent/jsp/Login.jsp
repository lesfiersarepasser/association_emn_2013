<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Identifiez-vous</title>
</head>
<body>
	<h1>Login</h1>
	<form action="" method="post">
		<table>
			<tr>
				<td>Identifiant </td>
				<td><input type="text" name="logID" /></td>
			</tr>
			<tr>
				<td>Mot de passe </td>
				<td><input type="password" name="logPW" /></td>
			</tr>
			<tr>
				<td><input type="submit" name="login" value="Connexion" /></td>
			</tr>
		</table>
	</form>
	<p>
		Pas encore enregistré ? <a href="">Creez votre compte...</a>
	</p>
</body>
</html>