package Listas;
import java.util.Iterator;

/**
 * 
 */

/**
 * @author flaquitqm
 *
 */
public class IteradorArreglo<E> extends Iterador<E> {

	private int cabeza;
	private int actual;
	private int tamanio;
	private E[] arreglo;
	/**
	 * 
	 */
	public IteradorArreglo() {
		// TODO Auto-generated constructor stub
	}
	
	

	/**
	 * @param cabeza
	 * @param actual
	 * @param tamanio
	 */
	@SuppressWarnings("unchecked")
	public IteradorArreglo(int cabeza, int actual, int tamanio, Object arreglo[]) {
		this.cabeza = cabeza;
		this.actual = actual;
		this.tamanio = tamanio;
		this.arreglo = (E[]) arreglo;
	}

	


	/**
	 * @param tamanio
	 */
	@SuppressWarnings("unchecked")
	public IteradorArreglo(int tamanio,  Object arreglo[]) {
		this.tamanio = tamanio;
		this.cabeza = 0;
		this.actual = 0;
		this.arreglo = (E[]) arreglo;
	}



	@Override
	public boolean hasNext() {
		return actual < tamanio-1;
	}

	@Override
	public E next() {
		if (hasNext()){
			actual++;
			return (E) arreglo[actual];
		}
		return null;
	}
	
	public E get(){
		return arreglo[actual];
	}
	
	public void reset(){
		actual = cabeza;
	}

}
