package iut.bad;

public class Humain {

	protected String nom;
	protected String prenom;
	protected int age;
	
	public void details() {
		System.out.println(toString());
	}

	public String toString() {
		return nom + " " + prenom + " " + age;
	}

}
