package exo_switch;

public class Oiseau extends Animal {

	public Oiseau(String nom, int age) {
		super(nom, age);
		
	}

	@Override
	public void crier() {
		System.out.println("Cocorico... Cocorico...");
		
	}

}
