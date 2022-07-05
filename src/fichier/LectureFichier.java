package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

//TP 15 – APPRENDRE A MANIPULER DES FICHIERS
public class LectureFichier {

	public static void main(String[] args) throws IOException {
		// Lire le contenu du fichier

		Path path=Paths.get("/Users/kegba/Documents/workspace-spring-tool-suite-4-4.14.1.RELEASE/approche-objet/src/fichier/file/recensement.csv");
		
		//Lire le contenu du fichier et affichez son contenu.
		List<String> listes = Files.readAllLines(path, StandardCharsets.UTF_8);
		
		/*
		 * Générez un fichier cible :
			 au format CSV (séparateur ; )
			 ne contenant que les villes de plus de 25000 habitants
			 avec seulement 3 informations : le nom de la ville, le code département et la
			population totale.
			
			*/
		 ArrayList<String> listeG = new ArrayList<>();
		 ArrayList<Ville> villesSup = new ArrayList<>();
		 ArrayList<String> listString = new ArrayList<>();
		 
		
		 
		
		
		 listeG.add("Code département;Nom de la commune;Population totale;");
		 for (int i=0;i<listes.size();i++) {
			 
			 String liste = listes.get(i);
			 //procedons au decoupage des chaines  avec ";"
			 String[] tokens =  liste.split(";");
			 //retirer des caractères blancs
			 String maValeur = tokens[8].trim().replaceAll(" ", "");
		 }
		 
		 //Générez maintenant un fichier de sortie ne contenant que les villes de plus de 25 000 habitants
		 int nb = 25000;
		 for (Ville ville : villesSup) {
				
				
				if (ville.getPopulationTotale() > nb) {
					villesSup.add(ville);
					listString.add(ville.getNom() + ";" + ville.getCodeDépartement() + ";" + ville.getNom_de_la_région() + ";" + ville.getPopulationTotale() + ";");
					System.out.println(ville.getNom() + ";" + ville.getCodeDépartement() + ";" + ville.getNom_de_la_région() + ";" + ville.getPopulationTotale() + ";");
				}
			}
		 Files.write(path, listes, StandardCharsets.UTF_8);
		
	}

}
