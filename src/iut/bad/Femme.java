package iut.bad;

public class Femme extends Humain {
	public Femme() {}
	
	public Femme(String nom, String prenom, int age) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}
	
	public static void main(String[] args) {
		Homme homme = new Homme("RAKOTO", "Andry", 30);
		Femme femme = new Femme("RASOA", "Alice", 25);
		
		homme.ami(femme);
	}

}
