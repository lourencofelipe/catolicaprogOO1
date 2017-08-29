package IntermediarioExecicio00;

import java.util.Scanner;

public class Caeser {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um nome ");
		String Nome = sc.nextLine();

		final String MSG_ORIGINAL = Nome;
		final int TAMANHO_MSG = MSG_ORIGINAL.length();

		char deslocamento = 3;

		for (int posicao = 0; posicao < TAMANHO_MSG; posicao++) {
			char caracter = (char) MSG_ORIGINAL.charAt(posicao);
			char letraCifrada = (char) (caracter + deslocamento);

			if (letraCifrada > 'z')
				letraCifrada = (char) (letraCifrada - 26);

			System.out.print(letraCifrada);

		}

	}

}
