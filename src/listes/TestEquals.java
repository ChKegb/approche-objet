package listes;

public class TestEquals {
	
	
	/*
	 * Vérifiez que la méthode equals retourne true pour 2 instances de villes qui ont les mêmes attributs.
		o Vérifiez maintenant que la méthode retourne false si vous changez un des attributs.
		o Faites le test maintenant en utilisant l’opérateur == avec les mêmes attributs, puis avec des attributs différents. Que constatez-vous ?
		o Commentfairepourquelacomparaisonde2villesavecl’opérateur==retourne true.
	 * */

	public static void main(String[] args) {
		
		Ville ville1 = new Ville("Montpellier", 343000);
		Ville ville2 = new Ville("Lyon", 37800);
		Ville ville3 = new Ville("NImes", 33000);

		System.out.println("Test equals1 : " + ville1.equals(ville3) + "\n");
		System.out.println("Test equals2 : " + ville1.equals(ville2) + "\n");
		
		System.out.println("Test == 1 : " + (ville1 == ville2) + "\n");
		System.out.println("Test == 2 : " + (ville1 == ville3) + "\n");
		
		Ville ville4 = ville1;
		System.out.println("Test == 3 : " + (ville1 == ville4) + "\n");
		
		

	}

}
