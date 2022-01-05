package exo_classJava.ImplementsPoo;

public class Chat implements Animal {

	private String nom;
	private int age;
		
	
	public Chat(String nom, int age) {
		this.setNom(nom);
		this.setAge(age);
	}
	
	@Override
	public void crier() {
	
		System.out.println("MIAOU... MIAOU...");
		
	}
	
	public String getNom() {return nom;}

	public void setNom(String nom) {this.nom = nom;}

	public int getAge() {return age;}

	public void setAge(int age) {this.age = age;}


}
