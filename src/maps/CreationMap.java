package maps;

import java.util.HashMap;



public class CreationMap {

	public static void main(String[] args) {
		// Créez une map nommée mapSalaires et qui permet de stocker les informations de salaire (valeur) en fonction du prénom de la personne (clé).
		
		HashMap<String,Integer> mapSalaires=new HashMap<>();
		
		//Ajouter les informations de salaire (valeur) en fonction du prénom de la personne (clé)
		
		mapSalaires.put("Paul", 1750);
		mapSalaires.put("Hicham", 1825);
		mapSalaires.put("Yu", 2250);
		mapSalaires.put("Ingrid",2015 );
		mapSalaires.put("Chantal",2418 );	
		
		// affichez sa taille
		
		System.out.println("\n la taille de maps est : "+ mapSalaires.size());

	}

}
