package controle;

import modelo.Usuario;

public class ControleUsuario {
	
	private Usuario[] user;
	private int i = 0;
	
	public void getInfoUsuario() {
		String s = new String();
		s = Usuario.getNomeUsuario();
		user[i].nomeUsuario = s;
		
		double dAlt;
		dAlt = Usuario.getAlturaUsuario();
		
		double dPeso;
		dPeso = Usuario.getPesoUsuario();
		
		int iPrat;
		iPrat = Usuario.getPraticaExercicios();
		
		
	
	}
}
