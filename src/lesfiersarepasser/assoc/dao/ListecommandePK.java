package lesfiersarepasser.assoc.dao;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the LISTECOMMANDE database table.
 * 
 */
@Embeddable
public class ListecommandePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false)
	private int idcommande;

	@Column(insertable=false, updatable=false)
	private String codearticle;

	public ListecommandePK() {
	}
	public int getIdcommande() {
		return this.idcommande;
	}
	public void setIdcommande(int idcommande) {
		this.idcommande = idcommande;
	}
	public String getCodearticle() {
		return this.codearticle;
	}
	public void setCodearticle(String codearticle) {
		this.codearticle = codearticle;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ListecommandePK)) {
			return false;
		}
		ListecommandePK castOther = (ListecommandePK)other;
		return 
			(this.idcommande == castOther.idcommande)
			&& this.codearticle.equals(castOther.codearticle);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idcommande;
		hash = hash * prime + this.codearticle.hashCode();
		
		return hash;
	}
}