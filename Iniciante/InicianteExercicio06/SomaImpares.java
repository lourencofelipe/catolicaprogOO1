/*************************************
 * Soma Impares
 * @author Sorriso
 * 
 * 29/08/2017
 ************************************/
package InicianteExercicio06;

import java.util.Scanner;

public class SomaImpares {

	private int numeroInicial;
	private int numeroFinal;

	public int getNumeroInicial() {
		return numeroInicial;
	}

	public void setNumeroInicial(int numeroInicial) {
		this.numeroInicial = numeroInicial;
	}

	public int getNumeroFinal() {
		return numeroFinal;
	}

	public void setNumeroFinal(int numeroFinal) {
		this.numeroFinal = numeroFinal;
	}

	public double getSoma() {
		Scanner sc = new Scanner(System.in);

		int aux = 0;
		int start = numeroInicial + 1;
		for (int i = start; i < numeroFinal; i++) {
			if (i % 2 != 0) {
				aux = aux + i;
			}
		}
		return aux;
	}
}
