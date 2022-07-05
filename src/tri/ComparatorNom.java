package tri;

import java.util.Comparator;
//TP N°13 – APPRENDRE A UTILISER LE TRI
public class ComparatorNom implements Comparator<Ville>{

	@Override
	public int compare(Ville o1, Ville o2) {
		
		return o1.getNom().compareTo(o2.getNom());
	}
	
}
