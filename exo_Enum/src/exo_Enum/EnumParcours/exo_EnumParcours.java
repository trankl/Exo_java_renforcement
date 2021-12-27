package exo_Enum.EnumParcours;


/*
 * Déclarer un nouveau Enum intitulé “Genre” contenant deux clefs : “HOMME”, “FEMME”
Dans votre public static void main, 
afficher toutes les clefs du Enum à l’aide d’un for each et de la méthode “values()” existante dans le système Enum

 */
public class exo_EnumParcours {

	
	public enum Genre {
		HOMME, FEMME;
	}
	
	
	public static void main(String[] args) {

		System.out.println("--------Exercice (EnumParcours)---------------");
		
		
		Genre[] genres= Genre.values();
		
		for (Genre genre : genres) {
			System.out.println("Clef du Enum = "+ genre);
		}
		

	}

}
