package entites;

public class AdressePostale {
	int numéro_de_rue;
	String libellé_de_la_rue;
	int code_postal;
	String ville;	

	public AdressePostale(int numéro_de_rue,Sring libellé_de_la_rue,int code_postal,String ville) {
		this.numéro_de_rue=numéro_de_rue;
		this.code_postal=code_postal;
		this.libellé_de_la_rue=libellé_de_la_rue;
		this.ville=ville;
	}
	
	public int getNumeroderue() {
		return this.numéro_de_rue;
	}
	public String getVille() {
		return this.ville;
	}
	public String getLibelle() {
			return this.libellé_de_la_rue;
		}
	public int getCodePostale() {
		return this.code_postal;
	}
}
