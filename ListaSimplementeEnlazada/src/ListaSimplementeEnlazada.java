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
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void addFirst(Object value) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void addLast(Object value) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Object getFirst() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Object getLast() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Object removeFirst() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Object removeLast() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Object remove(Object value) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void add(Object value) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Object remove() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Object get() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean contains(Object value) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public int indexOf(Object value) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int lastIndexOf(Object value) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public Object get(int i) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Object set(int i, Object o) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void add(int i, Object o) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Object remove(int i) {
		// TODO Auto-generated method stub
		return null;
	}


	
	
	
}
