package controle;

/**
*
* @author Matheus Raphael Soares de Oliveira
* 
*/

import modelo.Alimento;
import view.TelaAlimento;

public class ControleAlimento {

	private Alimento food;
	
	private String foodName;
	private int amount;
	private double cal;
	private double pro;
	private double carb;
	private double fat;
	
	public ControleAlimento() {
		
		foodName = Alimento.getNomeAlimento();
		amount = Alimento.getQuantidade();
		cal = Alimento.getCalorias();
		pro = Alimento.getProteinas();
		carb = Alimento.getCarboidratos();
		fat = Alimento.getGorduras();
		
		food = new Alimento(foodName, amount, cal, pro, carb, fat); // Criando um novo objeto alimento
		
	}
	
}
