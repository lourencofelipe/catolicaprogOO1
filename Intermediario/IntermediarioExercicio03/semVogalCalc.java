package IntermediarioExercicio03;

public class semVogalCalc {
	private int cont = 0;
	private String palavra;
	private String[] lista = new String[] { "A", "a", "E", "e", "I", "i", "O", "o", "U", "u" };

	public String Calc() {

		for (cont = 0; cont < lista.length; cont++) {
			palavra = palavra.replace(lista[cont], "*");
		}
		// System.out.println("Palavra com substituição: " + palavra);
		return palavra;
	}

	public String getPalavra() {
		return palavra;
	}

	public void setPalavra(String palavra) {
		this.palavra = palavra;
	}

}