package exo_switch;

public class Chien extends Animal {

	public Chien(String nom, int age) {
		super(nom, age);
	}

	@Override
	public void crier() {
		System.out.println("ouaf... ouaf... ");
		
	}

}
