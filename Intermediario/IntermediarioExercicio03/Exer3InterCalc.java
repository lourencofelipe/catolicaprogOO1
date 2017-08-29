package IntermediarioExercicio03;

import java.util.Scanner;

public class Exer3InterCalc {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Digite a Palavra ou Frase: ");
		String palavra = scn.nextLine();

		semVogalCalc sv2 = new semVogalCalc();

		sv2.setPalavra(palavra);

		System.out.println("Palavra com substituição: " + sv2.Calc());
	}
}