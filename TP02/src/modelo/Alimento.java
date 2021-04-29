package modelo;

/**
*
* @author Matheus Raphael Soares de Oliveira
* 
*/

public class Alimento {

	private static String nomeAlimento;
	private static int quantidade; // quantidade do alimento de que vc tem os dados nutricionais, nao o tanto que comeu
	private static double calorias;
	private static double proteinas;
	private static double carboidratos;
	private static double gorduras;
	
	public Alimento(String nomeAlimento, int quantidade, double calorias, double proteinas, double carboidratos, double gorduras){
		Alimento.nomeAlimento = nomeAlimento;
		Alimento.quantidade = quantidade;
		Alimento.calorias = calorias;
		Alimento.proteinas = proteinas;
		Alimento.carboidratos = carboidratos;
		Alimento.gorduras = gorduras;
	}
	
	
	public static String getNomeAlimento() {
		return nomeAlimento;
	}
	public void setNomeAlimento(String nomeAlimento) {
		Alimento.nomeAlimento = nomeAlimento;
	}
	public static int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		Alimento.quantidade = quantidade;
	}
	public static double getCalorias() {
		return calorias;
	}
	public void setCalorias(double calorias) {
		Alimento.calorias = calorias;
	}
	public static double getProteinas() {
		return proteinas;
	}
	public void setProteinas(double proteinas) {
		Alimento.proteinas = proteinas;
	}
	public static double getCarboidratos() {
		return carboidratos;
	}
	public void setCarboidratos(double carboidratos) {
		Alimento.carboidratos = carboidratos;
	}
	public static double getGorduras() {
		return gorduras;
	}
	public void setGorduras(double gorduras) {
		Alimento.gorduras = gorduras;
	}
	
}
