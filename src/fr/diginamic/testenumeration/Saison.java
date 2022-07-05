package fr.diginamic.testenumeration;

public enum Saison {
	
		PRINTEMPS("Printemps"),
		ETE("Ete"),
		AUTOMNE("Autonome"), 
		HIVER("Hiver");
		
		


private String libelle;
private int numeroOdre;

private Saison(String libelle) {
	this.libelle=libelle;
}


private Saison(int numeroOrdre) {
	this.numeroOdre=numeroOrdre;
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
