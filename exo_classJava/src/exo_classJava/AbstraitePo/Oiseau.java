package exo_classJava.AbstraitePo;

public class Oiseau extends Animal {

	public Oiseau(String nom, int age) {
		super(nom, age);
		
	}

	@Override
	public void crier() {
		System.out.println("CUI CUI CUI... CUI CUI CUI...");
		
	}

}
