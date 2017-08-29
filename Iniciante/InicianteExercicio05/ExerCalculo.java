package InicianteExercicio05;

import java.util.Scanner;

public class ExerCalculo {

	private int i;
	private int digitado;

	
	public int getI() {
		return i;
	}
	
	public void setI(int i) {
		this.i = i;
	}

	public int getDigitado() {
		return digitado;
	}

	public void setDigitado(int digitado) {
		this.digitado = digitado;
	}

	
	public int imprimirArray() {
		int[] array1 = new int[1000];
		for (int i = 0; i < array1.length; i++) {
			System.out.println("[" + (i + 1) + "]" + " = " + i * digitado);
		}
		return digitado;
	}
}
