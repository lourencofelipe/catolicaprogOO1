/*************************************
 * SaqueMain
 * @author Sorriso
 * 
 * 29/08/2017
 ************************************/
package InicianteExercicio09;

import java.util.Scanner;

public class SaqueMain {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Saque saque = new Saque();

		System.out.print("Informe o valor: ");
		int valor = sc.nextInt();

		saque.setSaqueini(valor);

		saque.calcularQuantidade();

		if (saque.isSaqueAutorizado()) {
			System.out.println("Saque = " + saque.getSaqueini()
					+ "\nNotas de cem = " + saque.getCem()
					+ "\nNotas de cinquenta =  " + saque.getCqt()
					+ "\nNotas de vinte =  " + saque.getVinte()
					+ "\nNotas de dez =  " + saque.getDez()
					+ "\nNotas de cinco =  " + saque.getCinco()
					+ "\nNotas de dois =  " + saque.getDois()
					+ "\nNotas de um =  " + saque.getUm());
		} else {
			System.out.println("O valor máximo de saque é 3000!");
		}

	}

}