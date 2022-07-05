package tri;

import java.util.ArrayList;
import java.util.Collections;
//TP N°13 – APPRENDRE A UTILISER LE TRI
public class TestVileTri {

	public static void main(String[] args) {
		
		//Créez une ArrayList et remplissez là avec l’ensemble des villes du TP précédent
		
		ArrayList<Ville> liste = new ArrayList<>();	
		liste.add(new Ville("Nice", 343000));
		liste.add(new Ville("Carcassonne", 47800));
		liste.add(new Ville("Narbonne", 53400));
		liste.add(new Ville("Lyon", 484000));
		liste.add(new Ville("Foix", 9700));
		liste.add(new Ville("Pau", 77200));
		liste.add(new Ville("Marseille", 850700));
		liste.add(new Ville("Tarbes", 40600));
		//Afficher les villes
		System.out.println("\nListe initiale :\n");
		for (Ville ville : liste) {
			System.out.println(ville.toString());
		}
		
		//Triez la liste
		Collections.sort(liste);
		
		System.out.println("\n listes apres tri   :\n");
		for (Ville ville : liste) {
			System.out.println(ville.toString());
		}
		
		//Réalisez un tri avec le premier comparateurNom et affichez le résultat
		Collections.sort(liste, new ComparatorNom());
		System.out.println("\n La liste des tri  des noms de ville avec ComparatorNOm :\n");
		for (Ville ville : liste) {
			System.out.println(ville.toString());
		}
		
		//Réalisez un tri avec le premier comparateurHabitant et affichez le résultat
		Collections.sort(liste, new ComparatorHabitant());
		System.out.println("\nLa liste des tri  des nombres des habitant de ville avec ComparatorHabitant  :\n");
		for (Ville ville : liste) {
			System.out.println(ville.toString());
		}

	}

}
