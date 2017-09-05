package AvancadoExercicio00;

/* Transformar inteiro em binario */
//https://stackoverflow.com/questions/2406432/converting-an-int-to-a-binary-string-representation-in-java
package conversorBinario;

public class Calc {

	private String integerString;

	public String getIntegerString() {
		return integerString;
	}

	public void setIntegerString(String integerString) {
		this.integerString = integerString;
	}

	public String calculo() {
		System.out.println(Integer.toBinaryString(Integer
				.parseInt(integerString)));
		System.out.print("Número em decimal digitado: ");
		return integerString;

	}
}

package conversorBinario;

import java.util.Scanner;

public class ConversorCalc {

	public static void main(String[] args) {
		String IntegerString;

		Scanner input = new Scanner(System.in);

		System.out.println("Informe um valor inteiro: ");
		IntegerString = input.nextLine();

		Calc novoObjt = new Calc();

		novoObjt.setIntegerString(IntegerString);

		System.out.println("O valor convertido para binário é: "
				+ novoObjt.calculo());

	}
}
