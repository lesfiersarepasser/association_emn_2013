package lesfiersarepasser.assoc.bean;

public class Commande {
private int id;
private int idUtilisateur;
private String codeArticles;


public Commande(int id, int idUtilisateur, String codeArticles) {
	super();
	this.id = id;
	this.idUtilisateur = idUtilisateur;
	this.codeArticles = codeArticles;
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getIdUtilisateur() {
	return idUtilisateur;
}
public void setIdUtilisateur(int idUtilisateur) {
	this.idUtilisateur = idUtilisateur;
}
public String getCodeArticles() {
	return codeArticles;
}
public void setCodeArticles(String codeArticles) {
	this.codeArticles = codeArticles;
}
}
