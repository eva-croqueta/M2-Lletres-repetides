
public class Fase1 {

	public static void main(String[] args) {
		char[] nom = crearChar();
		escriuNom(nom);

	}

	/**
	 * Crea un array amb caràcters del nom.
	 * 
	 * @return Array amb el nom "Eva".
	 */
	private static char[] crearChar() {
		char[] nom = new char[3];

		nom[0] = 'E';
		nom[1] = 'V';
		nom[2] = 'A';

		return nom;
	}

	/**
	 * Recorre l'array lletra per lletra i escriu el nom.
	 * 
	 * @param nom Array de caràcters amb el nom que es vulgui escriure.
	 */
	private static void escriuNom(char[] nom) {
		for (int i = 0; i < nom.length; i++) {
			System.out.println(nom[i]);
		}
	}

}
