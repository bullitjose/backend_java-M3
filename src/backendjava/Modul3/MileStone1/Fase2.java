package backendjava.Modul3.MileStone1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 * FASE 2
- Un cop tenim els noms de les ciutats guardats en variables haurem de pasar l’informacio a un array
(arrayCiutats).
- Quan tinguem l’array ple, haurem de mostrar per consola el nom de les ciutats ordenadas per ordre
alfabetic.



 */

public class Fase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Crea sis variables tipu string buides.
		String ciutat1, ciutat2, ciutat3, ciutat4, ciutat5, ciutat6;
		ArrayList<String> ciutats = new ArrayList<String>();
		/*
		 * Demana per consola que s’introdueixin els noms. Introdueix els següents noms
		 * de ciutats (Barcelona, Madrid, Valencia, Malaga, Cadis, Santander) per
		 * teclat.
		 */
		for (int i = 0; i < 6; i++) {
			/*
			 * Metode per initroduir per consola els noms de 6 ciutats, introduirCiutat i es
			 * guarden en ArrayList ciutats
			 */

			ciutats.add(introduirCiutat(i));

		}
		//Collection permet cridar metode sort per ordenar alfabeticament arraylist de les ciutats
		Collections.sort(ciutats);
		System.out.println(ciutats);
		

	}

	static String introduirCiutat(int num) {
		Scanner myObj = new Scanner(System.in);
		String inputText;

		// Enter username and press Enter
		System.out.println("Introdueix Ciutat (" + num + ")");
		inputText = myObj.nextLine();

		// retornem string introduit
		return inputText;
	}

}
