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
		lista.addFirst(9);
		lista.addFirst(9);
		int value = 9;
		
		if(lista.get(value)!=null)
		
		{
			System.out.println(lista);
		}
		else
			System.out.println("error");
	}
	
	

}
