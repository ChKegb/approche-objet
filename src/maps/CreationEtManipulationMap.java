package maps;

//import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
//import java.util.Set;



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
		
		// on procede au parcours 
		
		//Mettre en place une boucle pour afficher l'ensemble des cles contenues dans la map
		//Set<Integer> codes=mapVilles.keySet();
		System.out.println("des cles contenues dans la map :");
		for(Integer code:mapVilles.keySet()) {
			System.out.println(code);
			
		}
		//Mettre en place une boucle pour afficher l'ensemble des valeurs contenues dans la map
		//Collection <String> villes=mapVilles.values();
		System.out.println("des valeurs contenues dans la map :");
		for(String ville:mapVilles.values()) {
			System.out.println(ville);
			
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
