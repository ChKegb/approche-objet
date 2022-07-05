package entites;


public class TestAdressePostale {

	public static void main(String[] args) {
		
		
		/*Creer les instances */
		AdressePostale adr1=new AdressePostale(4, "st jean", 34000, "Montpellier");
		AdressePostale adr2= new AdressePostale(34,"avenue banquier",3400,"Montpellier");
	   
		//Afficher les adresses avec toString 
		
		System.out.println("Adresse : " + adr1.toString());
		System.out.println("Adresse : " + adr2.toString());
		

	}

}
