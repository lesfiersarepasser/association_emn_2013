
	<h1>Enregistrez-vous</h1>
	<form action="" method="post">
		<table>
			<tr>
				<td>Identifiant</td>
				<td><input type="text" name="logID" required="required" />*</td>
			</tr>
			
			<tr>
				<td>Mot de passe</td>
				<td><input type="password" name="logPW" required="required" />*</td>
			</tr>
			<tr>
				<td>Mot de passe (confirm)</td>
				<td><input type="password" name="logPWConfirm"
					required="required" />*</td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input type="email" name="logMail" required="required" />*</td>
			</tr>
			<tr>
				<td>Email (confirm)</td>
				<td><input type="email" name="logMailConfirm" required="required" />*</td>
			</tr>
			<tr>
				<td>Nom de famille</td>
				<td><input type="text" name="nom" required="required" />*</td>
			</tr>
			<tr>
				<td>Prenom</td>
				<td><input type="text" name="prenom" required="required" />*</td>
			</tr>
			<tr>
				<td>Adresse (rue)</td>
				<td><input type="text" name="adresse" /></td>
			</tr>
			<tr>
				<td>Code postal</td>
				<td><input type="text" name="codePostal" pattern="[0-9]{5}" /></td>
			</tr>
			<tr>
				<td>Ville</td>
				<td><input type="text" name="ville" /></td>
			</tr>
			<tr>
				<td>Pays</td>
				<td><select name="pays">
						<option value="">France(FR)</option>
						<option value="">Japon(JP)</option>
						<option value="">Allemagne(ALL)</option>
						<option value="">Espagne(ESP)</option>
				</select></td>
			</tr>
			<tr>
				<td><input type="submit" name="register" value="S'inscrire" /></td>
			</tr>
		</table>
	</form>
	<p>* Champ obligatoire</p>
