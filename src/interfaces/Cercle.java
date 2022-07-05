package interfaces;
//Tp 9 INTERFACES
public class Cercle implements ObjetGeometrique {

	private double rayon;

	
	public Cercle(double rayon) {
		super();
		this.rayon = rayon;
	}

	/** Retourne le périmètre d’une forme géométrique
	 *  * @return double
	*/
	public double perimetre() {
		
		return 2 * Math.PI*rayon;
	}
	
	/** Retourne la surface d’une forme géométrique
	 *  * @return double
	*/
	public double surface() {
		
		return Math.PI * rayon * rayon;
	}

	@Override
	public String toString() {
		return "Cercle [rayon=" + rayon + ", perimetre()=" + perimetre() + ", surface()=" + surface() + "]";
	}
	
	
	

}
