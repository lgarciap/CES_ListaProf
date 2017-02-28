/**
 * 
 */

/**
 * @author flaquitqm
 *
 */
public class ListaSimplementeEnlazada<E> implements ILista<E>{
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
	public int size() {
		if (cabeza != null)
			return 0;
		else
			return cantEl;
	}
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if (cabeza == null)
			return true;
		else
			return false;
	}
	@Override
	public void clear() {
		// TODO Auto-generated method stub
		cabeza = null;
	}
	@Override
	public void addFirst(E value) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void addLast(E value) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public E getFirst() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public E getLast() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public E removeFirst() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public E removeLast() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public E remove(E value) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void add(E value) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public E remove() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public E get() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean contains(E value) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public int indexOf(E value) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int lastIndexOf(E value) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public E get(int i) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public E set(int i, E o) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void add(int i, E o) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public E remove(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
