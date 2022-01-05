package exo_ImplementationInterface;
/*
 * Exercice (ImplementationInterface)
Créer une interface Java et nommer la “ICalcul” 
Cette interface est “le contrat” pour les opérations suivantes :
additionner
soustraire
multiplier
diviser
Créer une classe Java ‘Calculator” qui implémente cette interface.
Implémenter dans la classe Java l’ensemble des opérations du contrat d’interface.

 */

public class Main {

	public static void main(String[] args) throws Exception {
		System.out.println("----------- Exercice (ImplementationInterface)-----------");

		int x = 10;
		int y = 3;
		
		Calculator cal = new Calculator(x,y);
		
		cal.additionner(x, y);
		cal.soustraire(x, y);
		cal.multiplier(x, y);
		cal.diviser(x, y);
		
		
	}

}
