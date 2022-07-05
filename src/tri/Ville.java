package tri;

//TP N°13 – APPRENDRE A UTILISER LE TRI

public class Ville implements Comparable<Ville>{
	private String nom;
	private int nbHabitants;
	


	public Ville(String nom, int nbHabitants) {
		super();
		this.nom = nom;
		this.nbHabitants = nbHabitants;
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

	@Override
	//Implémentez la méthode compareTo de manière à ce que le tri se fasse sur le nom de la ville (par ordre alphabétique)
	/*
	public int compareTo(Ville o) {
		return this.nom.compareTo(o.getNom());
	}
	*/
	
	//Modifiez la classe Ville afin que désormais le tri se fasse sur le nombre d’habitants.
	public int compareTo(Ville o) {
		
		if(this.nbHabitants > o.nbHabitants) {
			return 1;
		}else if(this.nbHabitants < o.nbHabitants) {
			return -1;
		}else {
		return 0;
		}
	}

	@Override
	public String toString() {
		return "Ville [nom=" + nom + ", nbHabitants=" + nbHabitants + "]";
	}
	

}
