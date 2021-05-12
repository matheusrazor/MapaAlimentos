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
		
		/** Pega os dados apresentados na Tela de Alimento */
		foodName = TelaAlimento.tNomeAlimento;
		amount = TelaAlimento.tQuant;
		cal = TelaAlimento.tCalories;
		pro = TelaAlimento.tProteins;
		carb = TelaAlimento.tCarbs;
		fat = TelaAlimento.tFats;
		
		food = new Alimento(foodName, amount, cal, pro, carb, fat); /** Criando um novo objeto alimento */

	}
	
}
