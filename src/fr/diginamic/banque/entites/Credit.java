package fr.diginamic.banque.entites;

public class Credit extends Operation{

	// Constructeur
	
	public Credit(String date_operation, double montantOpération) {
		super(date_operation, montantOpération);
		
	}

     //Redéfinissez cette méthode dans la classe Credit pour qu’elle retourne « CREDIT »
	 public String getType() {
		 return "CREDIT";
	 }


	@Override
	public String toString() {
		String test=super.toString();
		return test  ;
	}


	

}
