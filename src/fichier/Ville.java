package fichier;

public class Ville {

	private String nom;
	private int codeDépartement;
	private String nom_de_la_région ;
	private Double PopulationTotale;
	
	public Ville(String nom, int codeDépartement, String nom_de_la_région, Double populationTotale) {
		super();
		this.nom = nom;
		this.codeDépartement = codeDépartement;
		this.nom_de_la_région = nom_de_la_région;
		PopulationTotale = populationTotale;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getCodeDépartement() {
		return codeDépartement;
	}

	public void setCodeDépartement(int codeDépartement) {
		this.codeDépartement = codeDépartement;
	}

	public String getNom_de_la_région() {
		return nom_de_la_région;
	}

	public void setNom_de_la_région(String nom_de_la_région) {
		this.nom_de_la_région = nom_de_la_région;
	}

	public Double getPopulationTotale() {
		return PopulationTotale;
	}

	public void setPopulationTotale(Double populationTotale) {
		PopulationTotale = populationTotale;
	}
	
	
	
	
	
	
	
	
	
	
	

}
