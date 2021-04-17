package modelo;

public class Usuario implements Calculadora {
	
	private String nomeUsuario; // Nome do usuario, usado para que + de 1 usuario possa manter registro de sua alimentacao
	private double pesoUsuario; // Peso do usuario em kg, usado pela interface calculadoras
	private double alturaUsuario; // Altura do usuario em cm
	private int praticaExercicios; // Pratica de exercicio, de 0 - 4. Sendo 0 = sedentario e 4 = muito ativo
	
	Usuario(String nomeUsuario, double pesoUsuario, double alturaUsuario, int praticaExercicios) {
		this.nomeUsuario = nomeUsuario;
		this.pesoUsuario = pesoUsuario;
		this.alturaUsuario = alturaUsuario;
		this.praticaExercicios = praticaExercicios;
	}
	
	public void indiceMC() {
		double imc = 0;
		imc = pesoUsuario/((alturaUsuario/100) * (alturaUsuario/100));
		System.out.println(imc);
	}
	
	public void caloriasDiarias() {
		double aux1 = 0, aux2 = 0, aux4 = 1, ans = 0;
		if(praticaExercicios == 0) {
			aux4 = 1.2;
		} else if(praticaExercicios == 1) {
			aux4 = 1.375;
		} else if(praticaExercicios == 2) {
			aux4 = 1.55;
		} else if(praticaExercicios == 3) {
			aux4 = 1.725;
		} else if(praticaExercicios == 4) {
			aux4 = 1.9;
		}
		aux1 = pesoUsuario * 10;
		aux2 = alturaUsuario * 6.25;
		ans = aux1 * aux4 + aux2;
		System.out.println("Suas calorias de manutenção, aproximadas: " + (ans + 5) + " para homens e " + (ans - 161) + " para mulheres.");
	}
	
	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public double getPesoUsuario() {
		return pesoUsuario;
	}

	public void setPesoUsuario(double pesoUsuario) {
		this.pesoUsuario = pesoUsuario;
	}

	public double getAlturaUsuario() {
		return alturaUsuario;
	}

	public void setAlturaUsuario(double alturaUsuario) {
		this.alturaUsuario = alturaUsuario;
	}

	public int getPraticaExercicios() {
		return praticaExercicios;
	}

	public void setPraticaExercicios(int praticaExercicios) {
		this.praticaExercicios = praticaExercicios;
	}

}
