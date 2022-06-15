package entites;


public class Personne {
	String nom;
	String prenom;
	AdressePostale adressePersonnelle;

	// constructeur par defaut 
	
	public Personne() {
		
	}
	// constructeur avec des parametre pour la classe personne
	
	public Personne(String nom,String prenom) {
		super();
		this.nom=nom;
		this.prenom=prenom;	
			
	}
	// second constructeur à la classe Personne avec les 3 paramètres
	
	public Personne(String nom,String prenom,AdressePostale adressePersonnelle) {
		super();
		this.nom=nom;
		this.prenom=prenom;
		this.adressePersonnelle =adressePersonnelle;
			
	}
	
	//ajoutez une méthode qui prend un argument en paramètre et permet de modifier la variable d’instance nom de Personne
	
	public void  setNom (String nom) {
		this.nom=nom;
	}
	
	// ajoutez une méthode similaire pour modifier le prénom.
	
	public void setPrenom(String prenom) {
		
		this.prenom=prenom;
	}
	
	// ajoutez une méthode similaire pour modifier l’adresse
	
	public void setAdressePostale(AdressePostale adresse) {
	
		this.adressePersonnelle =adresse;
	}
	
	/*Les Methodes de la classe 
	 * 
	 * 
	 * */
	
	
	
	//les getteurs
	
	public String getNom(){
		return this.nom;
	}
	public String getPrenom(){
		return this.pr�nom;
	}
	public AdressePostale getAdressePersonnelle() {
		
		return this.adressePersonnelle;
	}
	
	//les setters 
	public void setNom(string nom) {
		this.nom=nom;
	}
	public void setPreNom(string prenom) {
		this.pr�nom=prenom;
	}
 }
