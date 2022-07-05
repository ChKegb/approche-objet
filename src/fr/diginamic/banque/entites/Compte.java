package fr.diginamic.banque.entites;
/**
 * @author kegba
 * TP 5 : METTRE EN PLACE LES REGLES DE L’ENCAPSULATION
 * @param args
 */


public class Compte  {

	public int numéro_de_compte ;
	public double solde;
	
	/**
	 * Mise en place de constructeur
	 * @param numéro_de_compte
	 * @param solde
	 */
	
	public Compte(int numéro_de_compte,double solde){
		super();
		this.numéro_de_compte=numéro_de_compte;
		this.solde=solde;
			
	}
	
	/**
	 * Les Getters
	 */
	public int getNuméro_de_compte(){
		return numéro_de_compte;
	}	
	public double getSolde() {
		return solde;
	}
	
	/**
	 * Les accesseur setter 
	 */
	
	public void setNuméro_de_compte(int Numéro_de_compte) {
		this.numéro_de_compte=Numéro_de_compte;
	}
	
	public void  setSolde(double solde) {
		this.solde=solde;
	}
	
	// Redéfinissez la méthode toString()
	
	
	public String toString() {
		return "Compte [numéro_de_compte=" + numéro_de_compte + ", solde=" + solde + "]";
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


}
