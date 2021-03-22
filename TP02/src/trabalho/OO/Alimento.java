package trabalho.OO;

public class Alimento {

	private String nomeAlimento;
	private int quantidade; // quantidade do alimento de que vc tem os dados nutricionais, nao o tanto que comeu
	private double calorias;
	private double proteinas;
	private double carboidratos;
	private double gorduras;
	
	Alimento(String nomeAlimento, int quantidade, double calorias, double proteinas, double carboidratos, double gorduras){
		this.nomeAlimento = nomeAlimento;
		this.quantidade = quantidade;
		this.calorias = calorias;
		this.proteinas = proteinas;
		this.carboidratos = carboidratos;
		this.gorduras = gorduras;
	}
	
	
	public String getNomeAlimento() {
		return nomeAlimento;
	}
	public void setNomeAlimento(String nomeAlimento) {
		this.nomeAlimento = nomeAlimento;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getCalorias() {
		return calorias;
	}
	public void setCalorias(double calorias) {
		this.calorias = calorias;
	}
	public double getProteinas() {
		return proteinas;
	}
	public void setProteinas(double proteinas) {
		this.proteinas = proteinas;
	}
	public double getCarboidratos() {
		return carboidratos;
	}
	public void setCarboidratos(double carboidratos) {
		this.carboidratos = carboidratos;
	}
	public double getGorduras() {
		return gorduras;
	}
	public void setGorduras(double gorduras) {
		this.gorduras = gorduras;
	}
	
}
