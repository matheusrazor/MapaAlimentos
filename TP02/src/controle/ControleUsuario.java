package controle;

import modelo.Usuario;

public class ControleUsuario {
	
	private Usuario[] user;
	private int i = 0;
	
	public void getInfoUsuario() {
		String s = new String();
		s = Usuario.getNomeUsuario();
		
		double dAlt;
		dAlt = Usuario.getAlturaUsuario();
		
		double dPeso;
		dPeso = Usuario.getPesoUsuario();
		
		int iPrat;
		iPrat = Usuario.getPraticaExercicios();
		
		user[i] = new Usuario(s, dPeso, dAlt, iPrat);
	
	}
}
