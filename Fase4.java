import java.util.ArrayList;
import java.util.List;

public class Fase4 {

	public static void main(String[] args) {
		
		List<Character> charNom = crearCharNom();
		
		List<Character> charCognom = crearCharCognom();
		
		List<Character> fullName = fusionarLlistes(charNom, charCognom);

	    System.out.println("FullName: " + fullName);

	}
	
	/**
	 * Crea una llista de caràcters que formen el nom.
	 * @return nom.
	 */
	
	private static List<Character> crearCharNom() {
		List<Character> nom = new ArrayList<>();

		nom.add('E');
		nom.add('V');
		nom.add('A');

		return nom;
	}
	
	/**
	 * Crea una llista de caràcters que formen el cognom.
	 * @return cognom.
	 */
	
	private static List<Character> crearCharCognom() {

		List<Character> cognom = new ArrayList<>();

		cognom.add('A');
		cognom.add('L');
		cognom.add('A');
		cognom.add('B');
		cognom.add('A');
		cognom.add('U');

		return cognom;
	}
	
	/**
	 * Fusionem les llistes 1 i 2.
	 * @param lista1 caràcters nom.
	 * @param lista2 caràcters cognom.
	 * @return merge llistes.
	 */
	private static List<Character> fusionarLlistes (List<Character> lista1, List<Character> lista2){
		
		List<Character> merge = new ArrayList<>();
	    merge.addAll(lista1);
	    merge.add(' ');
	    merge.addAll(lista2);
		
		return merge;
		
	}

}
