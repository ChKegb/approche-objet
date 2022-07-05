package maps;

import java.util.HashMap;

import listes.Ville;

public class MapVilles {

	public static void main(String[] args) {
		// Dans cette classe, créez une map permettant de stocker les instances de villes (valeur) en fonction de leur nom (clé).
		
		HashMap <String,Ville> villemaps=new HashMap<>();
		villemaps.put("Nice", new Ville("Nice", 343000));
		villemaps.put("Carcassonne", new Ville("Carcassonne", 47800));
		villemaps.put("Narbonne", new Ville("Narbonne", 53400));
		villemaps.put("Lyon", new Ville("Lyon", 484000));
		villemaps.put("Foix", new Ville("Foix", 9700));
		villemaps.put("Pau", new Ville("Pau", 77200));
		villemaps.put("Marseille", new Ville("Marseille", 850700));
		villemaps.put("Tarbes", new Ville("Tarbes", 600));
		
		System.out.println("\n l'ensemble des villes \n");
		for(String test:villemaps.keySet()) {
			
			System.out.println(test + "\n");
		}
		
		//Recherchez et supprimez la ville qui a le moins d’habitants
		
		int min=0;
		Ville villeMin=null;
		for (String liste:villemaps.keySet()){
			if(villemaps.get(liste).getNbHabitants()< min) {
				min=villemaps.get(liste).getNbHabitants();
				villeMin=villemaps.get(liste);
			}
			
		}
		//suppression de la ville min 
		
		villemaps.remove(villeMin.getNom());
		//Affichez l’ensemble des villes restantes.
		System.out.println("\n l'ensemble des villes restantes \n");
		for(String testAf:villemaps.keySet()) {
				
				System.out.println(testAf + "\n");
			}
		}

}
