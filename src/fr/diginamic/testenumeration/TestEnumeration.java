package fr.diginamic.testenumeration;

public class TestEnumeration {

	public static void main(String[] args) {
		
		// Utilisez une boucle pour affichez toutes les saisons.
		System.out.println("\n Liste des saisons \n");
		for (Saison periode : Saison.values()) {
			System.out.println(periode.getLibelle() + " | "+ periode.getNumeroOdre());
		}
		/*
		 * Soit la chaine de caractères suivante : String nom = « ETE » ;
			o Utilisez une méthode de base des énumérations pour retrouver et afficher le libellé de l’instance de Saison dont le nom est ETE.
		 * */
		 String nom ="ETE";
		 Saison ete=Saison.valueOf(nom);
		 System.out.println(ete.getLibelle());
		 
		 
		 /*
		  * Soit la chaine de caractères suivante : String libelle = « Hiver » ;
			o Développez une méthode dans votre énumération qui retourne une instance
			de Saison en fonction du libellé.
			o Utilisez cette méthode afin de vérifier que c’est bien HIVER qui est retournée
			lorsque vous la tester avec la variable libelle.
		  * */
		 
		 String libelle ="Hiver";
		 Saison hiver=Saison.SaisonByLibelle(libelle);
		 System.out.println(hiver);
	}

}
