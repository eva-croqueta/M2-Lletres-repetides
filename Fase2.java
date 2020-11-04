import java.util.ArrayList;
import java.util.List;

public class Fase2 {

	public static void main(String[] args) {


		List<Character> nom = charNom();

		vocalOConsonant(nom);

	}
	
	/**
	 * Creem una llista per enmagatzemar els car�cters del nom.
	 * @return nom amb car�cters.
	 */
	private static List<Character>charNom(){
		
		List<Character> nom = new ArrayList<>();

		nom.add('E');
		nom.add('V');
		nom.add('A');
		
		return nom;
		
	}
	
	
	/**
	 * Recorre la llista i determina si el car�cter �s una vocal (ho treur� per
	 * consola), o un n�mero. Si no �s cap de les dues coses, llavors ser� una
	 * consonant i ho treur� per consola. Si troba un n�mero llavors dir� que els
	 * noms no contenen n�meros.
	 * @param nom llista de car�cters.
	 */
	private static void vocalOConsonant(List<Character> nom) {
		
		for (char i : nom) {
			if (i == 'A' || i == 'E' || i == 'I' || i == 'O' || i == 'U') {

				System.out.println("VOCAL");

			} else if (i != '0' && i != '1' && i != '2' && i != '3' && i != '4' && i != '5' && i != '6' && i != '7'
					&& i != '8' && i != '9') {

				System.out.println("CONSONANT");

			} else {

				System.out.println("Els noms de persones no contenen n�meros!");
			}
		}
		
	}
}
