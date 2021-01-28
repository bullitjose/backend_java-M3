package backendjava.Modul3.MileStone1;

import java.util.ArrayList;
import java.util.Scanner;

/*
Crea sis variables tipu string buides. 
Demana per consola que s’introdueixin els noms.  
Introdueix els següents noms de ciutats (Barcelona, Madrid,
 Valencia, Malaga, Cadis, Santander) per teclat. 
Mostra per consola el nom de les 6 ciutats.

 */

public class Fase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Crea sis variables tipu string buides.
		String ciutat1, ciutat2, ciutat3, ciutat4, ciutat5, ciutat0;
		ArrayList<String> ciutats = new ArrayList<String>();
		/*
		 * Demana per consola que s’introdueixin els noms. Introdueix els següents noms
		 * de ciutats (Barcelona, Madrid, Valencia, Malaga, Cadis, Santander) per
		 * teclat.
		 * 
		 */
		ciutat0 = introduirCiutat(0);
		ciutat1 = introduirCiutat(1);
		ciutat2 = introduirCiutat(2);
		ciutat3 = introduirCiutat(3);
		ciutat4 = introduirCiutat(4);
		ciutat5 = introduirCiutat(5);

		/*
		 * Imprimir per consola les ciutats introduides
		 */

		System.out.println("Ciutat (0) " + ciutat0);
		System.out.println("Ciutat (1) " + ciutat1);
		System.out.println("Ciutat (2) " + ciutat2);
		System.out.println("Ciutat (3) " + ciutat3);
		System.out.println("Ciutat (4) " + ciutat4);
		System.out.println("Ciutat (5) " + ciutat5);
	}

	/**
	 * Metode que demana per consola nom de ciutat
	 * 
	 * @param int num, numero de la ciutat
	 * @return retorna string amb la ciutat introduida
	 */
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
