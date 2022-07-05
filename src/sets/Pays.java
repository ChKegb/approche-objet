package sets;

public class Pays {
	private String nom;
	private int nbHabitants;
	private Double pib_habitant;
	
	
	public Pays(String nom, int nbHabitants, Double pib_habitant) {
		super();
		this.nom = nom;
		this.nbHabitants = nbHabitants;
		this.pib_habitant = pib_habitant;
	}


	@Override
	public String toString() {
		return "Pays [nom=" + nom + ", nbHabitants=" + nbHabitants + ", pib_habitant=" + pib_habitant + "]";
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


	public Double getPib_habitant() {
		return pib_habitant;
	}


	public void setPib_habitant(Double pib_habitant) {
		this.pib_habitant = pib_habitant;
	}

	
	
	
	
	
	
	
	
}
