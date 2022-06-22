package entites;

public class Personne {
	public String nom;
	public String prenom;
	public AdressePostale adressePersonnelle;

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
	

	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", adressePersonnelle=" + adressePersonnelle + "]";
	}

	
	/*Les Methodes de la classe 
	 * 
	 * 
	 * */
	
	
	
	//les getteurs
	
	//ajoutez une méthode qui retourne le nom
	public String getNom(){
		return this.nom;
	}
	//ajoutez une méthode qui retourne le prénom
	public String getPrenom(){
		return this.prenom;
	}
	//ajoutez une méthode qui retourne l’adresse
	public AdressePostale getAdressePersonnelle() {
		
		return this.adressePersonnelle;
	}
	
	//ajoutez une méthode qui permet d’afficher le nom et le prénom avec le nom de famille en majuscules.
	
 }
