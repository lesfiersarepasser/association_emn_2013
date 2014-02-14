package lesfiersarepasser.assoc.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the COMMANDE database table.
 * 
 */
@Entity
@NamedQuery(name="Commande.findAll", query="SELECT c FROM Commande c")
public class Commande implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID")
	private int id;
	@Column(name="FLAG")
	private int flag;

	//bi-directional many-to-one association to Utilisateur
	@ManyToOne
	@JoinColumn(name="IDUTILISATEUR")
	private Utilisateur utilisateur;

	//bi-directional many-to-one association to Listecommande
	@OneToMany(mappedBy="commande")
	private List<Listecommande> listecommandes;

	public Commande() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getFlag() {
		return this.flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}

	public Utilisateur getUtilisateur() {
		return this.utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public List<Listecommande> getListecommandes() {
		return this.listecommandes;
	}

	public void setListecommandes(List<Listecommande> listecommandes) {
		this.listecommandes = listecommandes;
	}

	public Listecommande addListecommande(Listecommande listecommande) {
		getListecommandes().add(listecommande);
		listecommande.setCommande(this);

		return listecommande;
	}

	public Listecommande removeListecommande(Listecommande listecommande) {
		getListecommandes().remove(listecommande);
		listecommande.setCommande(null);

		return listecommande;
	}

}