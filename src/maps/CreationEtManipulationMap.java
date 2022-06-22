package maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;



public class CreationEtManipulationMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> mapVilles = new HashMap<>();
		
		mapVilles.put(13, "Marseille");
		mapVilles.put(34, "Montpellier");
		mapVilles.put(44, "Nantes");
		mapVilles.put(75, "Paris");
		mapVilles.put(31, "Toulouse");
		
	    //Ajouter dans mapVilles les informations pour Lille, Lyon et Bordeaux
		
		mapVilles.put(59, "Lille");
		mapVilles.put(69, "Lyon");
		mapVilles.put(33, "Bordeaux");
		
		// afficher l'ensemble des clés contenues dans la map
		// on recupere les cles dans notre hashmap
		// declaration d'un ensemble 
		Set<Integer> codes=mapVilles.keySet();
		// on procede au parcours 
		for(Integer code:codes) {
			System.out.println(codes);
			
		}
		//Mettre en place une boucle pour afficher l'ensemble des valeurs contenues dans la map
		
		Collection <String> villes=mapVilles.values();
		for(String ville:villes) {
			System.out.println(villes);
			
		}
		System.out.println("Parcours avec Iterator");
		// parcours avec Iterator
		Iterator<Integer> keys=mapVilles.keySet().iterator();
		while(keys.hasNext()) {
			Integer key=keys.next();
			System.out.println(key);
			String ville=mapVilles.get(key);
			System.out.println(ville);
;		}
		
		//Afficher la taille de la map
		System.out.println("\n la taille de maps est de :"+ mapVilles.size());
		
	}

}
