package fr.diginamic.banque.entites;

public class Debit extends Operation {

	// les constructeurs avec parametres
	public Debit(String date_operation, double montantOpération) {
		super(date_operation, montantOpération);
			
	}

	
	// Methode toString
	public String toString() {
		String test=super.toString();
		return test  ;
	}

    //Redéfinissez cette méthode dans la classe Credit pour qu’elle retourne « DEBIT »
	
	public String getType() {
		 return "DEBIT";
	 }

	

	
}
