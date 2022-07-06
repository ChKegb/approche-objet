package fr.diginamic.testexceptions;

public class Ville {
	
	private String nom;
	private int nbreHabts;
	
	
	public Ville(String nom, int nbreHabts) {
		super();
		this.nom = nom;
		this.nbreHabts = nbreHabts;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public int getNbreHabts() {
		return nbreHabts;
	}


	public void setNbreHabts(int nbreHabts) {
		this.nbreHabts = nbreHabts;
	}
	
	
	

}
