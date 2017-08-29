package InicianteExercicio08;

import java.util.Map;
import java.util.HashMap;


	public class Centena extends Expression {
		
		private Expression ex = new Dezena();
		
		private Map<String, String> map = new HashMap<String,String>();
		{
			map.put("1","cento");
			map.put("100","cem");
			map.put("2","duzentos");
			map.put("3","trezentos");
			map.put("4","quatrocentos");
			map.put("5","quinhentos");
			map.put("6","seissentos");
			map.put("7","setecentos");
			map.put("8","oitocentos");
			map.put("9","novecentos");	
		}
		public String interpret(String number){
			String resposta = null;

			// verifica se o número possui pelo menos 3 casas
			if (number.length() < 3){
				// se o número possuir menos de 3 casas passe para a classe Dezena avaliar.
				resposta = ex.interpret(number);
			} else {
				if (this.left(number,3).equals("100")){
					resposta = "cem";
				} else {
					// isolando o primeiro digito: Ex: 123 --> (1)23
					String primeiroDigito = this.left(number,1);
					resposta = this.getFromMap(map, primeiroDigito);
					
					// pega o lado remanescente do número Ex: 1(23) --> 23
					String remanescente = this.right(number,2);
					String dezena = ex.interpret(remanescente);

					if (dezena.equals("")){
						resposta += dezena;
					} else {
						resposta += " e " + dezena;
					}
				}			
			}
			return resposta;	
		}
	}
