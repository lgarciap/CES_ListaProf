import java.text.Normalizer.Form;

/**
 * 
 */

/**
 * @author flaquitqm
 *
 */

public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListaSecuencial<Integer> lista = new ListaSecuencial<Integer>(10);
		int tamanio = lista.getTamanio();
		lista.addFirst(5);
		lista.addFirst(9);
		lista.addFirst(4);
		lista.addFirst(6);
		lista.addFirst(8);
		lista.addFirst(7);
		int value = 3;
		lista.removeFirst();
			System.out.println(lista.get(value));
	}
	
	

}
