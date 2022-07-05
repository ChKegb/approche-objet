package tri;

import java.util.Comparator;
//TP N°13 – APPRENDRE A UTILISER LE TRI
public class ComparatorHabitant implements Comparator<Ville> {

	@Override
	public int compare(Ville o1, Ville o2) {
		if(o1.getNbHabitants() > o2.getNbHabitants()) {
			return 1;
		}else if(o1.getNbHabitants() < o2.getNbHabitants()) {
			return -1;
		}else {
			return 0;
			}
	}

}
