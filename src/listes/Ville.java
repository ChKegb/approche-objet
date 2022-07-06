package listes;

import java.util.Objects;

public class Ville {
	private String nom;
	private int nbHabitants;
	
	//ajouter un attribut d’instance de type Continent.
	private Continent continent;
		
		
	
	
	
	//Complétez le constructeur afin d’ajouter le continent en paramètre



	public Ville(String nom, int nbHabitants,Continent continent) {
		super();
		this.nom = nom;
		this.nbHabitants = nbHabitants;
		this.setContinent(continent);
	}

	//Complétez la méthode toString de la classe Ville afin que cette méthode affiche le libellé du continent auquel le pays appartient.
	@Override
	public String toString() {
		return "Ville [nom=" + nom + ", nbHabitants=" + nbHabitants + ", continent=" + continent + "]";
	}



	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Ville)) {
			return false;
		}
		
		Ville other = (Ville) obj;
		return this == other ||new EqualsBuilder().append(nom, other.getNom()).append(nbHabitants,other.getNbHabitants()).isEquals();
		
	}
	
	
	
	
	
	
	
	
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}



	public int getNbHabitants() {
		return nbHabitants;
	}




	public void setNbHabitants(int nbHabitants) {
		this.nbHabitants = nbHabitants;
	}





	public Continent getContinent() {
		return continent;
	}





	public void setContinent(Continent continent) {
		this.continent = continent;
	}

}
