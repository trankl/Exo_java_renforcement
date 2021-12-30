package exo_GSON;

public class Person {

	private String nom;
	private int age;
	
	// Contructeur avec 2 paramettres
	public Person(String nom, int age) {
		super();
		this.nom = nom;
		this.age = age;
	}
	
	// initialisation contructeur
	public Person() {
		
		this.nom = "nom";
		this.age = 0;
	}
	
	
	@Override
	public String toString() {
		return "Person [nom=" + nom + ", age=" + age + "]";
	}

	// getter et setter
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
