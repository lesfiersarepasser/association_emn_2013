package lesfiersarepasser.assoc.bean;

public class Articles {
private int code;
private String nom;
private double prix;
private int stock;



public Articles(int code, String nom, double prix, int stock) {
	super();
	this.code = code;
	this.nom = nom;
	this.prix = prix;
	this.stock = stock;
}

public int getCode() {
	return code;
}
public void setCode(int code) {
	this.code = code;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public double getPrix() {
	return prix;
}
public void setPrix(double prix) {
	this.prix = prix;
}
public int getStock() {
	return stock;
}
public void setStock(int stock) {
	this.stock = stock;
}

}
