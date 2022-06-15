package entites;



public class AdressePostale {
	int numero_de_rue;
	String libelle_de_la_rue;
	int code_postal;
	String ville;
	
   //ajoutons un constructeur avec les 4 paramètres permettant de valoriser tous les attributs de la classe.

	public AdressePostale(int numero_de_rue,String libelle_de_la_rue,int code_postal,String ville) {
		super();
		this.numero_de_rue=numero_de_rue;
		this.code_postal=code_postal;
		this.libelle_de_la_rue=libelle_de_la_rue;
		this.ville=ville;
	}
	
	/* 
	 * Les Methodes
	 * 
	 * 
	 * */
	void afficherAdresse(){
		
	}
	void imprimerAdresse(){
		
	}
	void envoyerCourrier(){
		
	}
	
	public int getNumeroderue() {
		return this.numero_de_rue;
	}
	public String getVille() {
		return this.ville;
	}
	public String getLibelle() {
			return this.libelle_de_la_rue.;
		}
	public int getCodePostale() {
		return this.code_postal;
	}
}
