package lesfiersarepasser.assoc.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the LISTECOMMANDE database table.
 * 
 */
@Entity
@NamedQuery(name="Listecommande.findAll", query="SELECT l FROM Listecommande l")
public class Listecommande implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ListecommandePK id;

	private int quantite;

	//bi-directional many-to-one association to Article
	@ManyToOne
	@JoinColumn(name="CODEARTICLE")
	private Article article;

	//bi-directional many-to-one association to Commande
	@ManyToOne
	@JoinColumn(name="IDCOMMANDE")
	private Commande commande;

	public Listecommande() {
	}

	public ListecommandePK getId() {
		return this.id;
	}

	public void setId(ListecommandePK id) {
		this.id = id;
	}

	public int getQuantite() {
		return this.quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public Article getArticle() {
		return this.article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public Commande getCommande() {
		return this.commande;
	}

	public void setCommande(Commande commande) {
		this.commande = commande;
	}

}