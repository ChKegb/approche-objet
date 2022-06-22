package interfaces;
//Tp 9 INTERFACES
public class Rectangle implements ObjetGeometrique {
    //Declaration des attributs
	private double longueur;
	private double largeur;
	
	// Mise en place du constructeur avec des parametres 

	public Rectangle(double longueur, double largeur) {
		super();
		this.longueur = longueur;
		this.largeur = largeur;
	}
	
	
   //Methode toString()
	
	public String toString() {
		return "Rectangle [longueur=" + longueur + ", largeur=" + largeur + ", perimetre()=" + perimetre()
				+ ", surface()=" + surface() + "]";
	}



	public double perimetre() {
		
		return (longueur+largeur)*2;
	}

	@Override
	public double surface() {
		// TODO Auto-generated method stub
		return longueur*largeur;
	}

}
