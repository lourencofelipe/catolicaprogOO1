/*************************************
 * Circunferencia
 * @author Sorriso
 * 
 * 29/08/2017
 ************************************/
package InicianteExercicio03;

import java.util.Scanner;

public class Circunferencia {

	private double raio;

	private double circunferencia;

	private double area;

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public double getCircunferencia() {
		return circunferencia;
	}

	public void setCircunferencia(double circunferencia) {
		this.circunferencia = circunferencia;
	}

	public double getArea() {

		area = Math.PI * Math.pow(raio, 2);
		return area;

	}

}
