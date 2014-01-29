package lesfiersarepasser.assoc.bean;

public class Utilisateur {
	private int id;
	private String identifiant;
	private String mdp;
	private String nom;
	private String prenom;
	private String adresse;
	private String codePostale;
	private int idVille;
	
	
	
	
	public Utilisateur(int id, String identifiant, String mdp, String nom,
			String prenom, String adresse, String codePostale, int idVille) {
		super();
		this.id = id;
		this.identifiant = identifiant;
		this.mdp = mdp;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.codePostale = codePostale;
		this.idVille = idVille;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getIdentifiant() {
		return identifiant;
	}
	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}
	public String getMdp() {
		return mdp;
	}
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getCodePostale() {
		return codePostale;
	}
	public void setCodePostale(String codePostale) {
		this.codePostale = codePostale;
	}
	public int getIdVille() {
		return idVille;
	}
	public void setIdVille(int idVille) {
		this.idVille = idVille;
	}
}
