package listes;
import java.util.ArrayList;
import java.util.List;
//Tp 10 APPRENDRE A UTILISER LIST ET ARRAYLIST
public class CreationListe {

	public static void main(String[] args) {
		
		
		//Exercice 1 créez une ArrayList d’entiers et stockez-y tous les nombres de 1 à 100
		ArrayList<Integer > liste = new ArrayList<>();
       
       for (int i=0;i<100;i++) {
    	   liste.add(i);
       }
       System.out.println(liste);
       //Affichez la taille de la liste en utilisant la méthode de la classe ArrayList fournissant cette information.
       System.out.println("\n la taille de la liste est : " + liste.size());
     
	}

}
