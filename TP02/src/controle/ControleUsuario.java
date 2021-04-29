package controle;

/**
*
* @author Matheus Raphael Soares de Oliveira
* 
*/

import modelo.Usuario;
import view.TelaUsuario;

public class ControleUsuario {
	
	private Usuario user;
	
	private String name;
	private double weight;
	private double height;
	private int condition;
	
	public ControleUsuario() {
		
		name = Usuario.getNomeUsuario();
		weight = Usuario.getPesoUsuario();
		height = Usuario.getAlturaUsuario();
		condition = Usuario.getPraticaExercicios();
		
		user = new Usuario(name, weight, height, condition); // Criando um novo objeto usuario
		
	}
	
	
}
