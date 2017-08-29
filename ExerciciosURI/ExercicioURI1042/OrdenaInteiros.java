/* ARRUMAR OS IFS */
package ExercicioURI1042;

import java.util.Scanner;

public class OrdenaInteiros {
	public static void main(String[] args) {
		int a, b, c;
		System.out.println("Digite 3 numeros");
		a = STDIN_SCANNER.nextInt();
		b = STDIN_SCANNER.nextInt();
		c = STDIN_SCANNER.nextInt();
		if (a > b /* a>b */) {
			if (b > c) {
				System.out.printf("%4d%4d%4d\n", a, b, c); // a>b>c
			} else // a>b,c>=b
			if (a > c) {
				System.out.printf("%4d%4d%4d\n", a, c, b); // a>c>=b
			} else {
				System.out.printf("%4d%4d%4d\n", c, a, b); // c>=a>b
			}
		} else // b>=a
		if (b > c /* b>=a,b>c */) {
			if (a > c) {
				System.out.printf("%4d%4d%4d\n", b, a, c); // b>=a>c
			} else {
				System.out.printf("%4d%4d%4d\n", b, c, a); // b>c>=a
			}
		} else {
			System.out.printf("%4d%4d%4d\n", c, b, a); // c>=b>=a
		}
	}

	public final static Scanner STDIN_SCANNER = new Scanner(System.in);
}