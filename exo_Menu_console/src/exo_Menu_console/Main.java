package exo_Menu_console;

import java.util.Scanner;

/* TKL- 21 déc. 2021:
 *  Erreur de saisie : Number format exception
Appuyer sur :
[ADD] - Additionner deux nombres
[QUIT] - Quitter le programme

 */
public class Main {

	public static void main(String[] args) throws Exception {

		String add = "ADD";
		String quit = "QUIT";

		// Afficher le menu
		System.out.println("Saisir votre choix (ADD/QUIT) : \n"
				+ "[ADD] - Additionner deux nombres \n"
				+ "[QUIT] - Quitter le programme ");
		// lire le clavier
		Scanner scanner = new Scanner(System.in);	
		// prendre le valeur du clavier et mettre dans 1 objet type String
		String options = scanner.nextLine();
		// faire comparation du resultat et afficher l'option qu'on a choisi
		// si on a choisi "ADD"
		while (options.equals(add)) {
			try { 	

				System.out.print("Veuillez saisir le nombre A : ");
				int numberA = scanner.nextInt();
				System.out.print("Veuillez saisir le nombre B : ");
				int numberB = scanner.nextInt();

				int sum = numberA + numberB;
				System.out.println(" A+B = " + sum);

			} // s'il y a erreur de saisir les nombres, 1 message erreur va etre affiché
			catch (Exception e) {
				System.out.println("Erreur de saisie : Number format exception ");
				extracted(e);
			} // ré-afficher le menu
			finally { 	
				System.out.println("Saisir votre choix (ADD/QUIT) : \n"
						+ "[ADD] - Additionner deux nombres \n"
						+ "[QUIT] - Quitter le programme ");	
				scanner = new Scanner(System.in);	
				options = scanner.nextLine();
				
				// au case qu'on a choisi option "QUIT"
				if (options.equals(quit)) {
					// Afficher 1 message 
					System.out.println("Le programme est fini");
					// Arreter du programme
					break;
				}      
			}  
		}
		// Fermer du clavier
		scanner.close();

	}

	private static void extracted(Exception e) throws Exception {
		throw new Exception("Erreur de saisie : Number format exception" + e.toString());
	}
}

