package fr.diginamic.testenumeration;
//TP N°3 – LES ENUMERATIONS
/*
 * Crééz une énumération Saison (PRINTEMPS, ETE, AUTOMNE, HIVER), avec 2 attributs :
	o un libellé (Printemps, Eté, Automne, Hiver) et
	o un numéro d’ordre (1,2,3,4).
 * */
public enum Saison {
	
		PRINTEMPS("Printemps",1),
		ETE("Ete",2),
		AUTOMNE("Autonome",3), 
		HIVER("Hiver",4);



	private String libelle;
	private int numeroOdre;
	

	private Saison(String libelle, int numeroOdre) {
		this.libelle = libelle;
		this.numeroOdre = numeroOdre;
	}
	
//Développez une méthode dans votre énumération qui retourne une instance de Saison en fonction du libellé.
	
	public static Saison SaisonByLibelle(String libelle){
		for (Saison periode : Saison.values())
		{
			if (periode.libelle.equals(libelle))
				return periode;
		}
		
		return null;
	}
	
	
	
	
	
	
	public String getLibelle() {
		return this.libelle;
	}

	
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}


	public int getNumeroOdre() {
		return this.numeroOdre;
	}
	
	
	public void setNumeroOdre(int numeroOdre) {
		this.numeroOdre = numeroOdre;
	}





	

}
