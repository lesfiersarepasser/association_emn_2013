package lesfiersarepasser.assoc.dao;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the ARTICLE database table.
 * 
 */
@Entity
@NamedQuery(name="Article.findAll", query="SELECT a FROM Article a")
public class Article implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String code;

	private String nom;

	private double prix;

	//bi-directional many-to-one association to Listecommande
	@OneToMany(mappedBy="article")
	private List<Listecommande> listecommandes;

	public Article() {
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getPrix() {
		return this.prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public List<Listecommande> getListecommandes() {
		return this.listecommandes;
	}

	public void setListecommandes(List<Listecommande> listecommandes) {
		this.listecommandes = listecommandes;
	}

	public Listecommande addListecommande(Listecommande listecommande) {
		getListecommandes().add(listecommande);
		listecommande.setArticle(this);

		return listecommande;
	}

	public Listecommande removeListecommande(Listecommande listecommande) {
		getListecommandes().remove(listecommande);
		listecommande.setArticle(null);

		return listecommande;
	}

}