/**
 * 
 */

/**
 * @author flaquitqm
 *
 */
public class ListaSimplementeEnlazada<E> implements ILista{
	private int cantEl;
	private Nodo<E> cabeza;
	/**
	 * @param cantEl
	 * @param cabeza
	 */
	public ListaSimplementeEnlazada(Nodo<E> cabeza) {
		this.cabeza = cabeza;
		this.cantEl = 1;
	}
	/**
	 * @return the cantEl
	 */
	public int getCantEl() {
		return cantEl;
	}
	/**
	 * @param cantEl the cantEl to set
	 */
	public void setCantEl(int cantEl) {
		this.cantEl = cantEl;
	}
	/**
	 * @return the cabeza
	 */
	public Nodo<E> getCabeza() {
		return cabeza;
	}
	/**
	 * @param cabeza the cabeza to set
	 */
	public void setCabeza(Nodo<E> cabeza) {
		this.cabeza = cabeza;
	}

	@Override
	public int tamanio() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public boolean estaVacia() {
		// TODO Auto-generated method stub
		if (cabeza == null)
			return true;
		else
			return false;
	}
	
	
	
}
