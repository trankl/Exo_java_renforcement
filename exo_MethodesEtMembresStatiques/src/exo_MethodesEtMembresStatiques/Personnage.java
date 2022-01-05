package exo_MethodesEtMembresStatiques;

public class Personnage {

	private static int m_int_compteur = 0;
	
	//créer une méthode statique qui permet d’incrémenter la variable.
	public static void incrementer() {
		m_int_compteur ++;
		System.out.println(" la variable de m_int_compteur = " + m_int_compteur);
	}
	
	public int getM_int_compteur() {
		return m_int_compteur;
	}
	
	
}
