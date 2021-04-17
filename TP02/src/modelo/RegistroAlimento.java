package modelo;

public class RegistroAlimento {
	
	private int quantConsumida; // quantidade consumida do alimento registrado
	private Alimento alimento;

	RegistroAlimento(int quantConsumida) {
		this.quantConsumida = quantConsumida;
	}
	
	public int getQuantConsumida() {
		return quantConsumida;
	}

	public void setQuantConsumida(int quantConsumida) {
		this.quantConsumida = quantConsumida;
	}
	
}
