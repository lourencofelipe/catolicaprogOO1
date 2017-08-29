/*************************************
 * Saque
 * @author Sorriso
 * 
 * 29/08/2017
 ************************************/
package InicianteExercicio09;

import java.util.Scanner;

public class Saque {

	private int saqueini, saque;

	private int cem = 0, cqt = 0, vinte = 0, dez = 0, cinco = 0, dois = 0,
			um = 0;

	private boolean saqueAutorizado = true;

	public boolean isSaqueAutorizado() {
		return saqueAutorizado;
	}

	public int getSaqueini() {
		return saqueini;
	}

	public void setSaqueini(int saqueini) {
		this.saqueini = saqueini;
		this.saque = saqueini;
	}

	public int getSaque() {
		return saque;
	}

	public int getCem() {
		return cem;
	}

	public int getCqt() {
		return cqt;
	}

	public int getVinte() {
		return vinte;
	}

	public int getDez() {
		return dez;
	}

	public int getCinco() {
		return cinco;
	}

	public int getDois() {
		return dois;
	}

	public int getUm() {
		return um;
	}

	public void calcularQuantidade() {

		saqueini = saque;

		if (saque > 0 && saque <= 3000) {

			while (saque >= 100) {
				saque = saque - 100;
				cem++;
			}
			while (saque >= 50) {
				saque = saque - 50;
				cqt++;
			}
			while (saque >= 20) {
				saque = saque - 20;
				vinte++;
			}
			while (saque >= 10) {
				saque = saque - 10;
				dez++;
			}
			while (saque >= 5) {
				saque = saque - 5;
				cinco++;
			}
			while (saque >= 2) {
				saque = saque - 2;
				dois++;
			}
			while (saque >= 1) {
				saque = saque - 1;
				um++;
			}

		} else {
			saqueAutorizado = false;
		}

	}
}
