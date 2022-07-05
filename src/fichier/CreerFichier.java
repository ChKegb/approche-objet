package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
// TP 15 – APPRENDRE A MANIPULER DES FICHIERS : Exercice CreerFichier
public class CreerFichier {

	public static void main(String[] args) throws IOException {
		

		Path path=Paths.get("/Users/kegba/Documents/workspace-spring-tool-suite-4-4.14.1.RELEASE/approche-objet/src/fichier/file/recensement.csv");
		Path path1=Paths.get("/Users/kegba/Documents/workspace-spring-tool-suite-4-4.14.1.RELEASE/approche-objet/src/fichier/file/recensement_100.csv");
		
		List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
		ArrayList<String> lineDest = new ArrayList<>();
		
		int compteur = 1;
		for (String line: lines) {
			if(compteur <= 100) {
				lineDest.add(line);
				System.out.println(compteur + " | " + line);
			}
			compteur++;
		}
		
		Files.write(path, lineDest, StandardCharsets.UTF_8);

	}

}
