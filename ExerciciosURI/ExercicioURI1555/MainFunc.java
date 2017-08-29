package ExercicioURI1555;

import java.util.Scanner;

public class MainFunc {
	public static void main(String[] args) {

		Scanner tec = new Scanner(System.in);
		System.out.println("Digite um 3 numeros");
		int n = tec.nextInt();
		while (n > 0) {
			int x = tec.nextInt();
			int y = tec.nextInt();
			if (x >= 1 && y >= 1 && x <= 100 && y <= 100) {
				int r = ((3 * x) * (3 * x)) + (y * y);
				int b = (2 * (x * x)) + ((5 * y) * (5 * y));
				int c = (-100 * x) + (y * y * y);
				if (r > b && r > c) {
					System.out.println("Rafael ganhou\n");
				} else if (b > r && b > c) {
					System.out.println("Beto ganhou\n");
				} else if (c > r && c > b) {
					System.out.println("Carlos ganhou\n");
				} else {
					System.out.println("Ninguem ganhou");
				}
			}
			n--;
		}
	}
}
