package entites;

public class TestAdressePostale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Cr�er 2 instances d�AdressePostale en renseignant les valeurs de tous les attributs.
		AdressePostale adresse1= new AdressePostale(34,"Monptellier",10,"rue des espoirs");
		AdressePostale adresse2= new AdressePostale();
		
		/*
			//affecter les valeurs  � chaque attribut de la classe 
			adresse1.code_postal=34;
			adresse1.ville = "Monptellier";
			adresse1.num�ro_de_rue = 10;
			adresse1.libell�_de_la_rue ="rue des espoirs";
		 */
		
		System.out.println(adresse1.num�ro_de_rue);
		System.out.println(adresse1.libell�_de_la_rue);
		System.out.println(adresse1.code_postal);
		System.out.println(adresse1.ville);
	}

}
