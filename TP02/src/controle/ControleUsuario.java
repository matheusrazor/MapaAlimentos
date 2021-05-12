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
		
		/* Pego os valores digitados na Tela de Usuário */
		name = TelaUsuario.tNome;
		weight = TelaUsuario.tPeso;
		height = TelaUsuario.tAltura;
		condition = TelaUsuario.tExer;
		
		user = new Usuario(name, weight, height, condition); /* Criando um novo objeto usuario */
		
	}
	
	
}
