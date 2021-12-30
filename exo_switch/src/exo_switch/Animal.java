package exo_switch;

public abstract class Animal {
	private String nom;
	private int age;
	
	
	public Animal(String nom, int age) {
		this.setNom(nom);
		this.setAge(age);
	}


	public abstract void crier();


	public String getNom() {return nom;}

	public void setNom(String nom) {this.nom = nom;}

	public int getAge() {return age;}

	public void setAge(int age) {this.age = age;}
	
}
