package exo_classJava.toStringPoo;

public class Animal {

	private String animal_nom;
	private int animal_age;
	
	// Définir une méthode toString qui affiche le nom de l’animal et son âge.
	@Override
	public String toString() {
		return "Animal [animal_nom=" + animal_nom + ", animal_age=" + animal_age + "]";
	}
	
	
	
	// Définir un constructeur prenant en paramètre le nom et l'âge de l’animal
	public Animal(String i_animal_nom,int i_animal_age) {
		this.animal_nom = i_animal_nom;
		this.animal_age = i_animal_age;
	}

	// Définir une méthode “crier()” dans laquelle vous mettrez simplement un “System.out.println()” d’un cri d’un animal.
	public void crier() {
		
		System.out.println("miaule... miaule...");
		
	}

	public String getAnimal_nom() {
		return animal_nom;
	}
	public void setAnimal_nom(String animal_nom) {
		this.animal_nom = animal_nom;
	}
	public int getAnimal_age() {
		return animal_age;
	}
	public void setAnimal_age(int animal_age) {
		this.animal_age = animal_age;
	}
	
	
}
