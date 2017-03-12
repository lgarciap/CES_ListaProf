/**
 * 
 */
package Listas;

/**
 * @author flaquitqm
 *
 */
public class IteradorListaEnlazada<E> extends Iterador<E> {

	private Nodo<E> actual,cabeza;
	
	
	public IteradorListaEnlazada(Nodo<E> cabeza) {
		this.cabeza = cabeza;
		reset();
	}

	@Override
	public boolean hasNext() {
		return actual != null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public E next() {
		E temporal = actual.getValor();
		actual = actual.getSiguiente();
		return temporal;
	}

	@Override
	public E get() {
		// TODO Auto-generated method stub
		return actual.getValor();
	}

	@Override
	public void reset() {
		actual = cabeza;
		
	}

}
