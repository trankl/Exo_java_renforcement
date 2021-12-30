package exo_JSONsimple;

import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/* TKL- 30 déc. 2021:
* Ajouter la librairie JSON Simple: json-simple-1.1.jar 
* https://code.google.com/archive/p/json-simple/
Instancier trois objets JSON et y remplir les valeurs suivantes :

{
	nom : “Médor”
	age : “10”
}
{
	nom : “Milou”
	age : “5”
}
{
	nom : “Minou”
	age : “7”
}

Afficher les trois objets à l’aide de la méthode “ToJSONString()”

Instancier ensuite un tableau JSON et y ajouter les trois précédents objets JSON

Afficher le tableau à l’aide de la méthode “ToJSONString()”

*/

public class Main {
	
	
	public static void main(String[] args) {

		System.out.println("\n----------Exercice (JSON Simple)-------------------\n");
		
		
		//Instancier trois objets JSON et y remplir les valeurs suivantes 
		JSONObject json1 = new JSONObject();
		json1.put("nom", "Médor");
		json1.put("age", 10);
		
		JSONObject json2 = new JSONObject();
		json2.put("nom", "Milou");
		json2.put("age", 5);
		
		JSONObject json3 = new JSONObject();
		json3.put("nom", "Minou");
		json3.put("age", 7);
		
		// Afficher les trois objets à l’aide de la méthode “ToJSONString()”
		System.out.println("Affichage de l'objet 1: " + json1.toJSONString());
		System.out.println("Affichage de l'objet 2: " + json2.toJSONString());
		System.out.println("Affichage de l'objet 3: " + json3.toJSONString());

		// Instancier un tableau JSON 
		JSONArray tableau = new JSONArray();
		
		// Ajouter les trois précédents objets JSON
		tableau.add(json1);
		tableau.add(json2);
		tableau.add(json3);
		
		// Afficher le tableau à l’aide de la méthode “ToJSONString()”
		System.out.println("Affichage du tableau JSON: " + tableau.toJSONString());
	}	

}
