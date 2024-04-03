package iut.bad;

public class Humain implements Consommation{

	protected String nom;
	protected String prenom;
	protected int age;
	
	public void details() {
		System.out.println(toString());
	}

	public String toString() {
		return nom + " " + prenom + " " + age;
	}
	
	public void manger() {
		throw new UnsupportedOperationException();
	}
	
	public void boire() {
		throw new UnsupportedOperationException();
	}
	
	public void ami(Humain autre) {
		
	}

}
