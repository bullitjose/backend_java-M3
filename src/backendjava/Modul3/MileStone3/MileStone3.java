package backendjava.Modul3.MileStone3;

import java.util.Scanner;

public class MileStone3 {

	/**
	 * Metode de la serie fibonacci *
	 * 
	 * @param n, numero int d'entrada, entre 1 i 100
	 * 
	 */
	public static void fib(int n) {
		// Estadi inicial
		int previ = 0;
		int actual = 1;
		int seguent;

		for (int i = 1; i <= n; i++) {
			seguent = previ;
			previ = actual + previ;
			actual = seguent;

			System.out.print(actual + ", ");
		}

	}

	/**
	 * Metode per introduir numero en format correcte, numero en int
	 * 
	 * @param sc
	 * @param prompt text del prompt
	 * @return i, el valor int valid entrat
	 */
	public static int getInt(Scanner sc, String prompt) {
		int i = 0;
		boolean isValid = false;
		while (isValid == false) {
			System.out.print(prompt);
			// hasNextDouble, torna true si scanner contiene int
			if (sc.hasNextInt()) {
				// nextInt,
				i = sc.nextInt();
				isValid = true;
			} else {
				System.out.println("----Nota no valida!!");
			}
			sc.nextLine();// Descartar aquesta linea introduida
		}
		return i;
	}

	/**
	 * Metode per introduir numero en rang correcte, entre 1 i 100
	 * 
	 * @param sc
	 * @param prompt
	 * @param min, valor int minim del rang de notes
	 * @param max, valor int maxim del rang de notes
	 * @return i, valor int valid per rang i format
	 */
	public static int getIntAmbRang(Scanner sc, String prompt, int min, int max) {
		int i = 0;
		boolean isValid = false;
		while (isValid == false) {
			i = getInt(sc, prompt);// Cridar metode getDouble, validar format
			if (i <= min) {
				System.out.println("----Ha de ser igual o més gran que 1!!");
			} else if (i >= max) {
				System.out.println("----Nota no valida, ha de ser menor o igual que 100!!");

			} else {
				isValid = true;
			}

		}
		return i;
	}

	public static void main(String args[]) {

		String opcio = "si";
		while (opcio.equalsIgnoreCase("si")) {
			Scanner sc = new Scanner(System.in);
			int num = getIntAmbRang(sc, "Introduir numero per calcular seqüècia de Fibonacci fins aquest? ", 1, 100);
			fib(num);
			System.out.println();
			System.out.println("Vols continuar? (si/no): ");
			opcio = sc.next();
			sc.nextLine();

		}

		System.out.println("---Adeu!!");

	}
}
