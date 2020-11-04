import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Fase3 {

	public static void main(String[] args) {

		List<Character> charList = crearChar();

		HashMap<Character, Integer> numVegades = vegadesCaracters(charList);

		System.out.println(numVegades);

	}

	/**
	 * Crea una llista amb els caràcters del nom.
	 * 
	 * @return nom.
	 */

	private static List<Character> crearChar() {

		List<Character> nom = new ArrayList<>();

		nom.add('E');
		nom.add('V');
		nom.add('A');

		return nom;

	}

	/**
	 * Creem un HashMap pels caracters i calculem les vegades amb un bucle for each.
	 * @param charList lista de caràcters.
	 * @return lletres i vegades.
	 */
	private static HashMap<Character, Integer> vegadesCaracters(List<Character> charList) {

		HashMap<Character, Integer> lletres = new HashMap<>();

		for (Character charNom : charList) {
			int numVegades = 0;

			for (Character caractersNom : charList) {

				if (charNom == caractersNom) {
					numVegades++;
				}

			}

			lletres.put(charNom, numVegades);

		}

		return lletres;

	}

}
