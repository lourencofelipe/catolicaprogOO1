/*************************************
 * CalculoA1
 * @author Felipe
 * 
 * 29/08/2017
 ************************************/
package InicianteExercicio02;

public class CalculoA1 {
	private String nome;
	private double salarioFixo;
	private double totalVendas;
	private double percentualVendas;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalarioFixo() {
		return salarioFixo;
	}

	public void setSalarioFixo(double salarioFixo) {
		this.salarioFixo = salarioFixo;
	}

	public double getTotalVendas() {
		return totalVendas;
	}

	public void setTotalVendas(double totalVendas) {
		this.totalVendas = totalVendas;
	}

	public double calcPorcentagem() {
		percentualVendas = (totalVendas * 15) / 100;
		return percentualVendas;
	}
}
