package IntermediarioExercicio01;

import java.util.Scanner;

public class Letras {
	public static void main(String[] args) {
		// Temos a frase

		System.out.println("Digite um valor");
		Scanner teste = new Scanner(System.in);
		String frase = teste.nextLine();

		int len = frase.length();
		char[] tempCharArray = new char[len];
		int palavra = 0;

		for (int i = 0; i < len; i++) {
			tempCharArray[i] = frase.charAt(i);

			char auxiliar = tempCharArray[i];
			String maldita = Character.toString(auxiliar);

			if (maldita.contains(" ")) {
				System.out.println(palavra);
				palavra = 0;
			} else if (i == (len - 1)) {
				System.out.println(palavra + 1);
			} else {
				palavra++;
			}
		}

	}
}
