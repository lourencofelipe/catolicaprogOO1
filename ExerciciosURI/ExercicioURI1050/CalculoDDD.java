package ExercicioURI1050;

public class CalculoDDD {
	private int DDD;

	public int getDDD() {
		return DDD;
	}

	public void setDDD(int DDD) {
		this.DDD = DDD;
	}

	public String getCidade() {

		switch (DDD) {
		case 11:
			return "São Paulo";

		case 19:
			return "Campinas";

		case 21:
			return "Rio de Janeiro";

		case 27:
			return "Vitória";

		case 31:
			return "Belo Horizonte";

		case 32:
			return "Juiz de Fora";

		case 61:
			return "Brasília";

		case 71:
			return "Salvador";

		default:
			return "DDD não cadastrado";

		}

	}

}
