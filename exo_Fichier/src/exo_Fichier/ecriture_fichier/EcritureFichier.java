package exo_Fichier.ecriture_fichier;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;


/* TKL- 30 déc. 2021:

Exercice (EcritureFichier)
Écrire un programme qui va écrire un fichier de type TXT à partir d’une String.
NOTE : Le fichier TXT doit se trouver dans le même dossier que le programme JAR
NOTE : Bien penser à réaliser les différents close nécessaires
BONUS : Utiliser un Buffer pour optimiser l’écriture
BONUS : Utiliser une librairie externe telle que Apache FileUtils ?


il y a 2 methodes:
1- Premier méthode : utiliser simple FileWrite. mais cette methode, on n'utilise pas de mémoire-tampon
2 - Deuxième méthode : utiliser un BufferedWriter
 */

public class EcritureFichier {

	public static void main(String[] args) {
		System.out.println("\n----------Exercice (EcritureFichier)------------\n");

		System.out.println(" 1- Premier méthode : utiliser simple FileWrite");

		try {
			FileWriter fw = new FileWriter("NouveauFichier.txt");

			String message = SaisieClavier();

			fw.write("Bonjour, Bienvenue chez moi!");
			
			fw.write(message);
			fw.close();
			System.out.println("Le texte a été écrit avec succès");
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println(" 2- Deuxième méthode : utiliser un BufferedWriter");

		try {
			FileWriter fw = new FileWriter("NouveauText.txt", StandardCharsets.UTF_8);

			// Créer un BufferedWriter avec une taille de tableau de tampons de 16384 (32786 octets = 32 Ko).
			BufferedWriter br = new BufferedWriter(fw, 16384);
			// Creer 1 phase à ecrire dans fichier
			br.write("abc");
			// Creer nouveau ligne (phase) ou bien sauter ligne
			br.newLine();  
			br.write("def");
			br.newLine();
			br.write("ghi");
			// Vide le flux ou bien mettre tout les lignes dans la fichier
			br.flush();
			fw.close();
			System.out.println("Le texte a été écrit avec succès");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static String SaisieClavier() throws IOException {
		System.out.println("Entre phase que vous voulez ecrire: ");

		String ligne, all;
		
		/* 1- Methode Scanner pour lire clavier
		Scanner entree = new Scanner(System.in);

		ligne = entree.nextLine();
		

		*/ 
		// 2- Methode BufferedReader 
		BufferedReader entree = new BufferedReader
			      (new InputStreamReader(System.in));
		 ligne = entree.readLine();	
		 all = ligne;

		 while(ligne.length() > 0)
			{	
				ligne = entree.readLine();
				all = all + ligne;
			}
		

		System.out.println("all = " + all);
		return all;
	}

}
