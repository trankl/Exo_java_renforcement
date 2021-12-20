package exo_variable_main;


/* TKL- 20 déc. 2021:
 * Dans votre méthode « public static void main », 
 * déclarer une variable pour chaque type de donnée que vous connaissez 
 * et attribuer manuellement la valeur
 */


public class Main {

	public static void main(String[] args) {

		//TKL - 20 déc. 2021 - LES PRIMITIVES-----------------------------------------
		System.out.println("----------Liste des TYPES PRIMITIVES--------------------\n");


		// déclarer une variable pour type des nombres entiers (int) (de -2 147 483 648 à 2 147 483 647)
		int nombre = 12;
		System.out.println("Affichage de la variable type int = " + nombre);

		// declarer une variable pour type des nombres décimaux (double) (de 4.9*E-324 à 1.7*E308)
		double nombreDouble = 13/2;
		System.out.println("Affichage de la variable type long = " + nombreDouble);

		// declarer une variable pour type des réels, c'est-à-dire à virgules (float) (de 	-1.4*E-45 à 3.4*E38)
		float f = 13/7;
		System.out.println("Affichage de la variable type float = " + f);

		// declarer une variable type des caractères 
		char lettre = 'a';
		System.out.println("Affichage de la variable type caractere char = " + lettre);

		// declarer une variable type de boolean (vrai ou faux)
		boolean test = false;
		System.out.println("Affichage de la variable type boolean = "+ test);



		//TKL - 20 déc. 2021 - LES ENVELOPPEURS (WRAPPERS)-----------------------------
		System.out.println("\n----------Listes des TYPE ENVELOPPEURS--------------------\n");

		// declarer une variable pour type des chaînes de caractère (String)
		String phase = "C'est une phase.";
		System.out.println("Affichage de la variable type String = "+ phase);
		// declarer une variable pour type des nombres décimaux (Dsouble) 
		Double nbDouble = 12.8901;
		System.out.println("Affichage de la variable type Double = " + nbDouble);

	}

}
