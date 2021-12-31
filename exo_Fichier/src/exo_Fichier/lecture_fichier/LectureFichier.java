package exo_Fichier.lecture_fichier;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/* TKL- 30 déc. 2021:
* Exercice (LectureFichier)
Écrire un programme qui va lire un fichier de type TXT et afficher le contenu à l’écran.
NOTE : Le fichier TXT doit se trouver dans le même dossier que le programme JAR
NOTE : Bien penser à réaliser les différents close nécessaires
BONUS : Utiliser un Buffer pour optimiser la lecture
BONUS : Utiliser un StringBuilder pour optimiser la mémorisation dans une String
BONUS : Utiliser une librairie externe telle que Apache FileUtils ?

il y a 2 methodes pour lire 1 fichier Text
1- Premier méthode : utiliser un BufferdReader
2- Deuxième méthode : utiliser un Scanner


*/
public class LectureFichier {

	public static void main(String[] args) {
		
		System.out.println("\n----------Exercice (LectureFichier)------------\n");
		
		System.out.println("__________1- Premier méthode : utiliser un BufferdReader__________");
		try
	    {
	      // Le fichier d'entree
	      File file = new File("text.txt");    
	      
	      // Creer l'objet File Reader
	      FileReader fr = new FileReader(file);  
	      
	      // Creer l'objet BufferedReader pour optimiser la lecture         
	      BufferedReader br = new BufferedReader(fr);  
	      
	      // Creer un StringBuilder pour optimiser la mémorisation dans une String
	      StringBuffer sb = new StringBuffer();    
	      String line;
	      while((line = br.readLine()) != null)
	      {
	        // ajoute la ligne au buffer
	        sb.append(line);      
	        sb.append("\n");     
	      }
	      // Fermer l'objet File Reader
	      fr.close();    
	      System.out.println("Affichage le contenu du fichier: ");
	      System.out.println(sb.toString());  
	    }
	    catch(IOException e)
	    {
	      e.printStackTrace();
	    }
		
		System.out.println("__________2- Deuxième méthode : utiliser un Scanner__________");

		try
	    {
	      // Le fichier d'entree
	      FileInputStream file = new FileInputStream("/Volumes/lylys/workspaces/eclipse_workspaces/exercices/exo_Fichier/text.txt");   
	      
	      // Creer 1 objet Scanner pour lire le fichier txt
	      Scanner scanner = new Scanner(file);  
	      
	      System.out.println("Affichage le contenu du fichier: ");
	      
	      // Affichage chaque line du fichier
	      while(scanner.hasNextLine())
	      {
	        System.out.println(scanner.nextLine());
	      }
	      scanner.close();    
	    }
	    catch(IOException e)
	    {
	      e.printStackTrace();
	    }
		
	}
}
