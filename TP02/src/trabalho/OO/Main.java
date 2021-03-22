/*
 * @author: Matheus Raphael Soares de Oliveira
 * @studentID: 190058587
 * @title: Mapa de Alimentos
 * 
 */

package trabalho.OO;

public class Main {

	public static void main(String[] args) {
		Usuario user = new Usuario("Matheus", 65, 175, 2);
		Alimento pastel = new Alimento("Pastel", 100, 168, 4.67, 18.51, 8.21);
		MetaCalorias meta = new MetaCalorias(2000);
		MetaProteinas metaPro = new MetaProteinas(100);
	}

}
