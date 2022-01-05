package exo_classJava.AbstraitePo;

public class Chat extends Animal {

	public Chat(String nom, int age) {
		super(nom, age);
	}
	
	@Override
	public void crier() {
	
		System.out.println("MIAOU... MIAOU...");
		
	}
	
	


}
