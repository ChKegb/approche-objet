package sets;

import java.util.HashSet;

public class TestSetString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//nstanciez un HashSet de String contenant les éléments suivants :USA,France,Allemagne,UK,Italie,Japon,Chine,Russie,Inde
		HashSet < String> set =new HashSet<>();
		set.add("USA");
		set.add("France");
		set.add("Allemagne");
		set.add("UK");
		set.add("Italie");
		set.add("Japon");
		set.add("Chine");
		set.add("Russie");
		set.add("Inde");
		
		//Recherchez le pays dans cette liste qui a le plus grand nombre de lettres
		int max=0;
		String chaine="";
		for(String myString:set) {
			if(myString.length()> max) {
				max=myString.length();
				chaine=myString;
			}
		}
		System.out.println("\n le pays avec plus grand nombre de lettres  :"+chaine);
		
		//Supprimez ce pays
		set.remove(chaine);
		//Affichez enfin le contenu de la collection ainsi modifiée
		System.out.println("\n Mise à jour apres la suppression ");
		for(String myString:set) {
			System.out.println("\n"+myString);
		}
		

	}

}
