/**
 * 
 */

/**
 * @author flaquitqm
 *
 */
public class ListaSecuencial<E> implements ILista<E> {
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