package fr.diginamic.banque.entites;

public class Credit extends Operation{

	public Credit(String date_operation, double montantOpération) {
		super(date_operation, montantOpération);
		
	}


	 public String getType() {
		 return "CREDIT";
	 }


	@Override
	public String toString() {
		String test=super.toString();
		return test  ;
	}


	

}
