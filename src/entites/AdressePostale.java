package entites;

public class AdressePostale {
	int num�ro_de_rue;
	String libell�_de_la_rue;
	int code_postal;
	String ville;	

	public AdressePostale(int num�ro_de_rue,Sring libell�_de_la_rue,int code_postal,String ville) {
		this.num�ro_de_rue=num�ro_de_rue;
		this.code_postal=code_postal;
		this.libell�_de_la_rue=libell�_de_la_rue;
		this.ville=ville;
	}
	
	public int getNumeroderue() {
		return this.num�ro_de_rue;
	}
	public String getVille() {
		return this.ville;
	}
	public String getLibelle() {
			return this.libell�_de_la_rue;
		}
	public int getCodePostale() {
		return this.code_postal;
	}
}
