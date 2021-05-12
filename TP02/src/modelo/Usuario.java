package modelo;

/**
*
* @author Matheus Raphael Soares de Oliveira
* 
*/

import view.TelaUsuario;

public class Usuario {
	
	public static double imc = 0;
	public static double aux1 = 0, aux2 = 0, aux4 = 1, ans = 0;
	
	public static String nomeUsuario; /** Nome do usuario, usado para que + de 1 usuario possa manter registro de sua alimentacao -- Nao implementado */
	public static double pesoUsuario; /** Peso do usuario em kg, usado pela interface calculadoras */
	public static double alturaUsuario; /** Altura do usuario em cm */
	public static int praticaExercicios; /** Pratica de exercicio, de 0 - 4. Sendo 0 = sedentario e 4 = muito ativo */
	
	public Usuario(String nomeUsuario, double pesoUsuario, double alturaUsuario, int praticaExercicios) {
		Usuario.nomeUsuario = nomeUsuario;
		Usuario.pesoUsuario = pesoUsuario;
		Usuario.alturaUsuario = alturaUsuario;
		Usuario.praticaExercicios = praticaExercicios;
	}
	
	public static void indiceMC() {
		imc = view.TelaUsuario.tPeso/((view.TelaUsuario.tAltura/100) * (view.TelaUsuario.tAltura/100));
	}
	
	public static void caloriasDiarias() {
		if(view.TelaUsuario.tExer == 0) {
			aux4 = 1.2;
		} else if(view.TelaUsuario.tExer == 1) {
			aux4 = 1.375;
		} else if(view.TelaUsuario.tExer == 2) {
			aux4 = 1.55;
		} else if(view.TelaUsuario.tExer == 3) {
			aux4 = 1.725;
		} else if(view.TelaUsuario.tExer == 4) {
			aux4 = 1.9;
		}
		aux1 = view.TelaUsuario.tPeso * 10;
		aux2 = view.TelaUsuario.tAltura * 6.25;
		ans = aux1 * aux4 + aux2;
	}
	
	public static String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		Usuario.nomeUsuario = nomeUsuario;
	}

	public static double getPesoUsuario() {
		return pesoUsuario;
	}

	public void setPesoUsuario(double pesoUsuario) {
		Usuario.pesoUsuario = pesoUsuario;
	}

	public static double getAlturaUsuario() {
		return alturaUsuario;
	}

	public void setAlturaUsuario(double alturaUsuario) {
		Usuario.alturaUsuario = alturaUsuario;
	}

	public static int getPraticaExercicios() {
		return praticaExercicios;
	}

	public void setPraticaExercicios(int praticaExercicios) {
		Usuario.praticaExercicios = praticaExercicios;
	}

}
