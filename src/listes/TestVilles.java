package listes;

import java.util.ArrayList;

public class TestVilles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Créez une ArrayList de villes contenant les villes suivantes :
		
		ArrayList<Ville> villes=new ArrayList<>();
		villes.add(new Ville("Nice",343000 ));
		villes.add(new Ville("Carcassonne",47800  ));
		villes.add(new Ville("Narbonne",53400  ));
		villes.add(new Ville("Lyon",484000  ));
		villes.add(new Ville("Foix",9700 ));
		villes.add(new Ville("Marseille",850700 ));
		villes.add(new Ville("Tarbes",40600  ));
		
		//Recherchez et affichez la ville la plus peuplée
		
		int max=0;
		Ville villeMax=null;
		
		for(Ville listes:villes) {
			if(listes.getNbHabitants()>max) {
				max=listes.getNbHabitants();
				villeMax =  listes;

			}		
			
		}
		System.out.println("\n la ville la plus peuple est :"+villeMax.getNom());
		
		
		//Supprimez la ville la moins peuplée
		
		int min=villes.get(0).getNbHabitants();
		Ville villeMin=null;

		for(Ville listes:villes) {
			if(listes.getNbHabitants() < min) {
				min=listes.getNbHabitants();
				villeMin =  listes;

			}
			
			
		}
		//Afficher la ville la moins peuple
		System.out.println("\n la ville moins peuple :"+villeMin.getNom());
		// Suppression de la ville moins peuple
		villes.remove(villeMin);
		
		//Modifiez les villes de plus de 100 000 habitants en mettant leur nom en majuscules
		
		for(Ville listes:villes) {
			if(listes.getNbHabitants() > 100000) {}
			 	listes.setNom(listes.getNom().toUpperCase());
		}
		   
		//Affichez enfin la liste résultante
		for(Ville listes:villes) {
			
			System.out.println("\n"+ listes.getNom()+ " : " + listes.getNbHabitants());
		}
		

	}

}
