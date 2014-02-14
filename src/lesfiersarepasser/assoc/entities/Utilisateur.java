package lesfiersarepasser.assoc.entities;

import java.io.Serializable;

import javax.persistence.*;

import java.util.List;


/**
 * The persistent class for the UTILISATEUR database table.
 * 
 */
@Entity
@NamedQuery(name="Utilisateur.findAll", query="SELECT u FROM Utilisateur u")
public class Utilisateur implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID")
	private int id;

	@Column(name="ADRESSE")
	private String adresse;

	@Column(name="CODEPOSTAL")
	private String codepostal;

	@Column(name="LOGIN")
	private String login;

	@Column(name="NOM")
	private String nom;

	@Column(name="PASSWORD")
	private String password;

	@Column(name="PRENOM")
	private String prenom;

	@Column(name="VILLE")
	private String ville;

	//bi-directional many-to-one association to Commande
	@OneToMany(mappedBy="utilisateur")
	private List<Commande> commandes;

	//bi-directional many-to-one association to Pay
	@ManyToOne
	@JoinColumn(name="IDPAYS")
	private Pays pays;

	public Utilisateur() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAdresse() {
		return this.adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getCodepostal() {
		return this.codepostal;
	}

	public void setCodepostal(String codepostal) {
		this.codepostal = codepostal;
	}

	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getVille() {
		return this.ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public List<Commande> getCommandes() {
		return this.commandes;
	}

	public void setCommandes(List<Commande> commandes) {
		this.commandes = commandes;
	}

	public Commande addCommande(Commande commande) {
		getCommandes().add(commande);
		commande.setUtilisateur(this);

		return commande;
	}

	public Commande removeCommande(Commande commande) {
		getCommandes().remove(commande);
		commande.setUtilisateur(null);

		return commande;
	}

	public Pays getPays() {
		return this.pays;
	}

	public void setPays(Pays pays) {
		this.pays = pays;
	}

}