package Ejercicio1;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {

		float centigrados = gradoscent();
		float farenheit = gradosfarenheit(centigrados);
		System.out.println(centigrados + " grados centigrados son " + farenheit + " grados farenheit ");
	}

	public static float gradoscent() {
		Scanner aux = new Scanner(System.in);
		String valor = "";
		boolean esnumero = false;
		float centigrados = 0;
		do {
			System.out.println("Introduzca los grados centigrados:");
			valor = aux.nextLine();

			try {
				centigrados = Float.parseFloat(valor);
				esnumero = true;
			} catch (Exception e) {
				esnumero = false;
				System.out.println("No has introducido un numero");

			}
		} while (esnumero = false);

		return centigrados;

	}

	public static float gradosfarenheit(float centigrados) {
		float farenheit = 32 + (9 * centigrados / 5);
		return farenheit;

	}
}
