package sets;

import java.util.HashSet;

public class TestSetDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Dans cette classe instanciez un HashSet de doubles et placez y les éléments suivants : 1.5, 8.25, -7.32, 13.3, -12.45, 48.5, 0.01
		HashSet < Double> set =new HashSet<>();
		set.add(1.5);
		set.add(8.25);
		set.add(-7.32);
		set.add(-12.45);
		set.add(48.5);
		set.add(0.01);
		
		//Affichez tous les éléments de la collection
		for(Double myDouble:set) {
			System.out.println(myDouble);
		}
		//Recherchez le plus grand élément de la collection
		double max=0;
		for(Double myDouble:set) {
			if(myDouble > max) {
				max=myDouble;
			}
		}
		System.out.println("\n la valeur max est :"+max);
		
		//Supprimez le plus petit élément de la collection
		
		double min=0;
		for(Double myDouble:set) {
			if(myDouble < min) {
				min=myDouble;
			}
		}
		set.remove(min);
		//Affichez enfin le contenu de la collection ainsi modifiée
		for(Double myDouble:set) {
			System.out.println("\n mis à jour :"+myDouble);
		}
		
	}

}
