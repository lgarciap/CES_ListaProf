/**
 * 
 */

/**
 * @author flaquitqm
 *
 */
public class ListaSecuencial<E> implements ILista {
	private int tamanio;
	private E[] arreglo;
	private int cantElementos;
	/**
	 * 
	 */
	public ListaSecuencial(int tamanio) {
		// TODO Auto-generated constructor stub
		arreglo = (E[]) new Object[tamanio];
		cantElementos = 0;
	}
	/**
	 * @return the tamanio
	 */
	public int getTamanio() {
		return tamanio;
	}
	/**
	 * @param tamanio the tamanio to set
	 */
	public void setTamanio(int tamanio) {
		this.tamanio = tamanio;
	}
	/**
	 * @return the arreglo
	 */
	public E[] getArreglo() {
		return arreglo;
	}
	/**
	 * @param arreglo the arreglo to set
	 */
	public void setArreglo(E[] arreglo) {
		this.arreglo = arreglo;
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
