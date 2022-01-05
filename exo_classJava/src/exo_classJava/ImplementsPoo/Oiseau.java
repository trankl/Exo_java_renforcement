package exo_classJava.ImplementsPoo;

public class Oiseau implements Animal {
	
	private String nom;
	private int age;
	

	public Oiseau(String nom, int age) {
		this.setNom(nom);
		this.setAge(age);
		
	}

	@Override
	public void crier() {
		System.out.println("CUI CUI CUI... CUI CUI CUI...");
		
	}
	public String getNom() {return nom;}

	public void setNom(String nom) {this.nom = nom;}

	public int getAge() {return age;}

	public void setAge(int age) {this.age = age;}

}
