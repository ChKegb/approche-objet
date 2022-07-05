package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {
    //Attribut 
	private double taux_de_rémunération;
	
	
	public CompteTaux(int numéro_de_compte, double solde, double taux_de_rémunération) {
		super(numéro_de_compte, solde);
		this.taux_de_rémunération = taux_de_rémunération;
	}


	


	@Override
	public String toString() {
		//  faire appel au methode toString de la classe mere Compte 
		String infoCompte=super.toString();
		return infoCompte + "CompteTaux [taux_de_rémunération=" + taux_de_rémunération + "]";
	}





	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
