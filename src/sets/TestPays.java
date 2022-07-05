package sets;

import java.util.HashSet;

public class TestPays {

	public static void main(String[] args) {
		
		//créez un HashSet de pays contenant les pays suivants avec les informations correctes de nombre d’habitants et de PIB/Hab:
	
		HashSet<Pays> setPays = new HashSet<>();
		setPays.add(new Pays("USA", 331002651, 59495d));
		setPays.add(new Pays("France", 6273511, 43551d));
		setPays.add(new Pays("Allemagne", 14783942, 50206d));
		setPays.add(new Pays("UK", 88011, 43620d));
		setPays.add(new Pays("Italie", 461826, 37970d));
		setPays.add(new Pays("Japon", 4760461, 42659d));
		setPays.add(new Pays("Chine", 58323776, 16624d));
		setPays.add(new Pays("Russie", 145934462, 28712d));
		setPays.add(new Pays("Inde",14743, 174d));
		
		//Recherchez le pays avec le PIB/habitant le plus important
		
		Double max=0.0;
		Pays pays =null;
		for(Pays listePays :setPays) {
			if(listePays.getPib_habitant()>max) {
				max=listePays.getPib_habitant();
				pays=listePays;
			}
			
		}
		System.out.println(pays);
		
		//Recherchez le pays avec le PIB total le plus important
		
		
		
		Double min=0.0;
		Pays paysmin =null;
		for(Pays listePays :setPays) {
			if(listePays.getPib_habitant()< min) {
				min=listePays.getPib_habitant();
				paysmin=listePays;
			}
			
		}
		//Modifiez le contenu du HashSet pour mettre en majuscule le pays qui a le PIB total le plus petit
		pays.setNom(pays.getNom().toUpperCase());
		for(Pays listePays :setPays) {
			System.out.println(listePays);
			
		}
		//Supprimez le pays dont le PIB total est le plus petit
		setPays.remove(paysmin);
		
		//Affichez l’ensemble des pays ainsi modifiés avec leur nom, nombre d’habitants et PIB total
		
		for (Pays listesPays:setPays) {
			System.out.println(listesPays);
			
		}

	}

}
