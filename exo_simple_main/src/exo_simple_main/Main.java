package exo_simple_main;

/* TKL- 20 déc. 2021:
* Dans votre méthode classe main, 
* déclarer une variable membre pour chaque type de donnée que vous connaissez 
* et attribuer manuellement la valeur dans la méthode public static void main 
*/


public class Main {
	// déclarer une variable pour type des nombres entiers (int) (de -2 147 483 648 à 2 147 483 647)
	public static int nombre;
	// declarer une variable pour type des nombres décimaux (double) (de 4.9*E-324 à 1.7*E308)
	public static double nombreDouble;
	// declarer une variable pour type des réels, c'est-à-dire à virgules (float) (de 	-1.4*E-45 à 3.4*E38)
	public static float f;
	// declarer une variable type des caractères 
	public static char lettre;
	// declarer une variable type de boolean (vrai ou faux)
	public static boolean test;
	// declarer une variable pour type des chaînes de caractère (String)
	public static String phase;
	// declarer une variable pour type des nombres décimaux (Double) 
	public static Double nbDouble;
	
	
	public static void main(String[] args) {
		//TKL - 20 déc. 2021 - LES PRIMITIVES-----------------------------------------
		System.out.println("----------Liste des TYPES PRIMITIVES--------------------\n");


		// Mettre un valeur pour l'objet type int
		nombre = 12;
		System.out.println("Affichage de la variable type int = " + nombre);

		// Mettre un valeur pour l'objet type double
		nombreDouble = 13/2;
		System.out.println("Affichage de la variable type long = " + nombreDouble);

		// Mettre un valeur pour l'objet type float
		f = 13/7;
		System.out.println("Affichage de la variable type float = " + f);

		// Mettre un valeur pour l'objet type char
		lettre = 'a';
		System.out.println("Affichage de la variable type caractere char = " + lettre);

		// Mettre un valeur pour l'objet type boolean
		test = false;
		System.out.println("Affichage de la variable type boolean = "+ test);



		//TKL - 20 déc. 2021 - LES ENVELOPPEURS (WRAPPERS)-----------------------------
		System.out.println("\n----------Listes des TYPE ENVELOPPEURS--------------------\n");

		// Mettre un valeur pour l'objet type String
		phase = "C'est une phase.";
		System.out.println("Affichage de la variable type String = "+ phase);
		// Mettre un valeur pour l'objet type Double
		nbDouble = 12.8901;
		System.out.println("Affichage de la variable type Double = " + nbDouble);


	}

}
