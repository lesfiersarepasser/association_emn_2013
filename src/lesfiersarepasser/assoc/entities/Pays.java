package lesfiersarepasser.assoc.entities;

import java.io.Serializable;

import javax.persistence.*;

import java.util.List;


/**
 * The persistent class for the PAYS database table.
 * 
 */
@Entity
@Table(name="PAYS")
@NamedQuery(name="Pay.findAll", query="SELECT p FROM Pays p")
public class Pays implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID")
	private int id;
	
	@Column(name="NOM")
	private String nom;

	//bi-directional many-to-one association to Utilisateur
	@OneToMany(mappedBy="pays")
	private List<Utilisateur> utilisateurs;

	public Pays() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<Utilisateur> getUtilisateurs() {
		return this.utilisateurs;
	}

	public void setUtilisateurs(List<Utilisateur> utilisateurs) {
		this.utilisateurs = utilisateurs;
	}

	public Utilisateur addUtilisateur(Utilisateur utilisateur) {
		getUtilisateurs().add(utilisateur);
		utilisateur.setPays(this);

		return utilisateur;
	}

	public Utilisateur removeUtilisateur(Utilisateur utilisateur) {
		getUtilisateurs().remove(utilisateur);
		utilisateur.setPays(null);

		return utilisateur;
	}

}