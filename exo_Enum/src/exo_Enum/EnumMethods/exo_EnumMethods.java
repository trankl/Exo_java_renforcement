package exo_Enum.EnumMethods;


/*
 * Déclarer un nouveau Enum intitulé “Genre” contenant deux clefs : “HOMME”, “FEMME”

Ajouter dans le Enum la déclaration d’une méthode “Diminutif” 

Définir cette méthode dans vos deux clefs. 
Pour HOMME, la méthode retournera “Mr”. 
Pour FEMME, la méthode retournera “Mme”

Exercice (EnumMethods)

 */


public class exo_EnumMethods {

	public enum Genre {
		HOMME, FEMME;

		@Override
		public String toString() {
			if (this == HOMME) {
				return "Mr";
			} else if (this == FEMME) {
				return "Mme";
			}
			return super.toString();
		}
	}

	public static void main(String[] args) {

		System.out.println("--------Exercice (EnumMethods)---------------");

		
		System.out.println(" Cle HOMME donne le mot : " + Genre.HOMME);
		System.out.println(" Cle FEMME donne le mot : " + Genre.FEMME);
		
	}
}
