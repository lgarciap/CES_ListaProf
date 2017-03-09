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
	 * 
	 */
	public ListaSimplementeEnlazada() {
		// TODO Auto-generated constructor stub
		cantEl = 0;
		cabeza = new Nodo<E>(null);
	}
	/**
	 * @param cantEl
	 * @param cabeza
	 */
	public ListaSimplementeEnlazada(Nodo<E> cabeza) {
		if (cabeza != null){
			this.cabeza = cabeza;
			this.cantEl = 1;
		}
		else
			 cantEl = 0;
	}
	/**
	 * @return la cantidad de elementos de la lista (cantEl)
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
		if (cabeza == null)
			cabeza = new Nodo<E>(value);
		else{
			Nodo<E> nuevo = new Nodo<E>(value,cabeza);
			cabeza = nuevo;
		}
		cantEl++;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void addLast(E value) {
		// TODO Auto-generated method stub
		if (cabeza == null)
			cabeza = new Nodo<E>(value);
		else{
			Nodo<E> nuevo = new Nodo<E>(value);
			Nodo<E> actual = cabeza;
			while (actual.getSiguiente() != null){
				actual = actual.getSiguiente();
			}
			actual.setSiguiente(nuevo);
		}
		cantEl++;
	}
	
	@Override
	public E getFirst() {
		// TODO Auto-generated method stub
		return cabeza.getValor();
	}
	@SuppressWarnings("unchecked")
	@Override
	public E getLast() {
		// TODO Auto-generated method stub
		if (cabeza != null)
			if (cantEl == 1)
				return cabeza.getValor();
			else{
				Nodo<E> dedo = cabeza;
				while (dedo.getSiguiente() != null){
					dedo = dedo.getSiguiente();
				}
				return dedo.getValor();				
		}
		return null;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public E removeFirst() {
		// TODO Auto-generated method stub
		if (cabeza != null){
			Nodo<E> temp = cabeza; 
			cabeza = cabeza.getSiguiente();
			cantEl--;
			return temp.getValor();
		}
		else
			return null;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public E removeLast() {
		// TODO Auto-generated method stub
		Nodo<E> dedo = cabeza;
		Nodo<E> temp = null;
		if (size() == 1){
			cabeza = null;
			return (E) dedo;
		}
		else{
			while (dedo.getSiguiente().getSiguiente() != null){
				dedo = dedo.getSiguiente();
			}
			temp = dedo.getSiguiente();
			dedo.setSiguiente(null);
		}
		cantEl--;
		return temp.getValor();
	}
	
    /**
      * Elimina la primera ocurrencia de un valor de la lista. A lo sumo un valor ser� eliminado.
����� * @post elimina y devuelve el elemento igual al valor
����� * De lo contrario devuelve nulo
����� *
����� * @param value El valor que se va a eliminar.
����� * @return El valor eliminado.
     */
	@SuppressWarnings("unchecked")
	@Override
	public E remove(E value) {
		// TODO Auto-generated method stub
		Nodo<E> dedo = cabeza;
		Nodo<E> anterior = null;
		if (contains(value)){
			while (!isEmpty() && !cabeza.getValor().equals(value)){
				anterior = dedo;
				dedo = dedo.getSiguiente();
			}
			if (dedo != null){
				if (anterior == null){
					cabeza = cabeza.getSiguiente();
				}
				else
					anterior.setSiguiente(dedo.getSiguiente());
			}
						
			return dedo.getValor();
		}
		else
			return null;
	}
	@Override
	public void add(E value) {
		// TODO Auto-generated method stub
		addLast(value);
	}
	@Override
	public E remove() {
		// TODO Auto-generated method stub
		return removeLast();
	}
	@Override
	public E get() {
		// TODO Auto-generated method stub
		return getLast();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public boolean contains(E value) {
		// TODO Auto-generated method stub
		Nodo<E> dedo = cabeza;  
		while (dedo.getSiguiente() != null){
			if (dedo.getValor().equals(value))
				return true;
			dedo = dedo.getSiguiente();
		}
		return false;
	}
	@SuppressWarnings("unchecked")
	@Override
	public int indexOf(E value) {
		// TODO Auto-generated method stub
		int cont = 0;
		Nodo<E> dedo = cabeza;
		while (dedo.getSiguiente()!=null && !dedo.getValor().equals(value)){
			dedo = dedo.getSiguiente();
			cont++;
		}
		return cont;
	}
	@SuppressWarnings("unchecked")
	@Override
	/**
     * Determinar la �ltima ubicaci�n de un valor en la lista.
����� *
����� * @pre value no es nulo
����� * @post devuelve (0-origen) el �ndice de valor,
����� * O -1 si no se encuentra el valor
����� * Valor de valor @param buscado.
����� * �ndice @return (0 es el primer elemento) de valor, o -1
     */
	public int lastIndexOf(E value) {
		int cont = 0;
		int ultPos = 0;
		Nodo<E> dedo = cabeza;
		if (!contains(value))
			return -1;
		while (dedo.getSiguiente() != null){
			if (dedo.getValor().equals(value)){
				ultPos = cont;
			}
			dedo = dedo.getSiguiente();
			cont++;
		}
		return ultPos;
	}
	@SuppressWarnings("unchecked")
	@Override
	public E get(int i) {
		int count = 0;
		Nodo<E>dedo = cabeza;
		while (dedo.getSiguiente()!=null){
			if (count == i)
				return dedo.getValor();
			dedo = dedo.getSiguiente();
			count++;
		}
		return null;
	}
	
	 /**
      * Modifica el valor almacenado en la posici�n i en el objeto o, devolviendo el valor antiguo.
����� *
����� * @pre 0 <= i <tama�o ()
����� * @post establece la entrada de la lista a valor o;
����� * Devuelve el valor anterior
����� * @param i ubicaci�n de entrada a ser cambiado.
����� * @param o nuevo valor
����� * @return valor anterior de la entrada i de la lista.
    */
	@SuppressWarnings("unchecked")
	@Override
	public E set(int i, E o) {
		int count = 0;
		Nodo<E> dedo = cabeza;
		E viejoValor = null;
		if(i<0 || i>cantEl)
			return null;
		while (dedo.getSiguiente()!=null){
			if (i==count){
				viejoValor = dedo.getValor();
				dedo.setValor(o);
				return viejoValor;
			}
			dedo = dedo.getSiguiente();
			count++;
		}
		return null;
	}
	
    /** 
     * Inserta el valor en la ubicaci�n. 
     * @pre 0 <= i <= size () 
     * @post a�ade el valor o en la ies�ma posici�n
     * @param i �ndice de este nuevo valor 
     * @param o valor a almacenar
     */
	@SuppressWarnings("unchecked")
	@Override
	public void add(int i, E o) {
		int count = 0;
		Nodo<E> dedo = cabeza;
		Nodo<E> nuevo = new Nodo<E>(o);
		if(i>=0 && i<=cantEl){
			if (i == 0) //Es la cabeza
				addFirst(o);
			else{
				if (i == cantEl-1)
					addLast(o);
				else{
					while (dedo.getSiguiente()!=null){
						if (count==i-1){
							nuevo.setSiguiente(dedo.getSiguiente());
							dedo.setSiguiente(nuevo);
						}
						dedo = dedo.getSiguiente();
						count++;
					}
				}
			}
		}
		
	}
	
	/**
     * Eliminar y devolver valor en la ubicaci�n i.
�����*
�����* @pre 0 <= i <tama�o ()
�����* @post elimina y devuelve el objeto encontrado en esa ubicaci�n
�����*
�����* @param i posici�n de valor a recuperar.
�����* @return valor recuperado de la ubicaci�n i (devuelve null si no es v�lido)
     */
	@SuppressWarnings("unchecked")
	@Override
	public E remove(int i) {
		int count = 0;
		Nodo<E> dedo = cabeza;
		E viejoValor = null;
		if(i<0 || i>cantEl)
			return null;
		if (i == 0)
			return removeFirst();
		if (i == cantEl-1)
			return removeLast();
		while (dedo.getSiguiente()!=null){
			if (count == i-1){
				viejoValor = get(i);
				Nodo<E> siguiente = dedo.getSiguiente(); 
				dedo.setSiguiente(siguiente.getSiguiente());
				return viejoValor;
			}
			dedo = dedo.getSiguiente();
			count++;
		}
		return null;
	}

}
