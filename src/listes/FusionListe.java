package listes;

import java.util.ArrayList;
import java.util.List;

public class FusionListe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> liste1 = new ArrayList<String>();

		liste1.add("Rouge");

		liste1.add("Vert");

		liste1.add("Orange");

		List<String> liste2 = new ArrayList<String>();

		liste2.add("Blanc");

		liste2.add("Bleu");

		liste2.add("Orange");
		
		ArrayList<String> liste3 = new ArrayList<String>();
		//Créez en utilisant des boucles une liste appelée liste3 et qui contient l’ensemble des données des 2 listes précédentes
		
		// on parcours la liste 
		for(String i :liste1) {
			liste3.add(i);
			
		}
		for(String i :liste2) {
			liste3.add(i);
			
		}
		// affichage de la liste3
		System.out.println(liste3);
		
	
		
	}

}
