package InicianteExercicio08;

import java.util.Map;
import java.util.HashMap;

	public class Unidade extends Expression {
		private Map<String, String> map = new HashMap<String,String>();
		{
			map.put("1","um");
			map.put("2","dois");
			map.put("3","três");
			map.put("4","quatro");
			map.put("5","cinco");
			map.put("6","seis");
			map.put("7","sete");
			map.put("8","oito");
			map.put("9","nove");	
		}
		public String interpret(String number){
			String resposta = "";

			// verifica se o número possui pelo menos 1 casa
			if (number.length() == 1) resposta = this.getFromMap(map,number);
			return resposta;	
		}
	}