/**
 * 
 */

/**
 * @author flaquitqm
 *
 */
public interface ILista<E> {
	
	/**
     * Determina el tamaño de la lista.
     *
     * @post devuelve el número de elementos en la lista
     * 
     * @return el número de elementos de la lista.
     */
    public int tamanio();

    /**
     * Determina si la lista está vacía.
     *
     * @post devuelve true si la lista if no tiene elementos
     *
     * @return True si la lista no tiene elementos.
     */
    public boolean estaVacia();

    /**
     * Quita todos los elementos de la lista
     *
     * @post vacía la lista
     */
    public void vaciar();

    /**
     * Inserta un elemento al inicio de la lista.
     *
     * @post El valor es añadido al inicio de la lista
     * 
     * @param valor El valor que se añade al inicio de la lista
     */
    public void adicionarPrimero(E valor);

    /**
     * Añade un valor en la cola de la lista (al final)
     *
     * @post un valor es añadido al final de la lista
     * 
     * @param valor El valor que se añade al final de la lista.
     */
    public void adicionarUltimo(E valor);

    /**
     * Obtiene el primer elemento de la lista
     *
     * @pre la lista no está vacía
     * @post devuelve el primer valor de la lista
     * 
     * @return Una referencia al primer valor de la lista.
     */
    public E obtenerPrimero();

    /**
     * Obtiene el último
     * Fetch last element of list.
     *
     * @pre list is not empty
     * @post returns last value in list
     * 
     * @return A reference to last element of list.
     */
    public E getLast();

    /**
     * Remove a value from first element of list.
     *
     * @pre list is not empty
     * @post removes first value from list
     * 
     * @return The value actually removed.
     */
    public E removeFirst();

    /**
     * Remove last value from list.
     *
     * @pre list is not empty
     * @post removes last value from list
     * 
     * @return The value actually removed.
     */
    public E removeLast();

    /**
     * Remove a value from list.  At most one of value
     * will be removed.
     *
     * @post removes and returns element equal to value
     *       otherwise returns null
     * 
     * @param value The value to be removed.
     * @return The actual value removed.
     */
    public E remove(E value);

    /**
     * Add an object to tail of list.
     *
     * @post value is added to tail of list
     * 
     * @param value The value to be added to tail of list.
     * @see #addLast
     */
    public void add(E value);

    /**
     * Removes value from tail of list.
     *
     * @pre list has at least one element
     * @post removes last value found in list
     * @return object removed.
     */
    public E remove();

    /**
     * Retrieves value from tail of list.
     *
     * @pre list has at least one element
     * @post returns last value found in list
     * @return object found at end of list
     */
    public E get();

    /**
     * Check to see if a value is in list.
     *
     * @pre value is not null
     * @post returns true iff list contains an object equal to value
     * 
     * @param value value sought.
     * @return True if value is within list.
     */
    public boolean contains(E value);

    /**
     * Determine first location of a value in list.
     *
     * @pre value is not null
     * @post returns (0-origin) index of value,
     *   or -1 if value is not found
     * 
     * @param value The value sought.
     * @return index (0 is first element) of value, or -1
     */
    public int indexOf(E value);

    /**
     * Determine last location of a value in list.
     *
     * @pre value is not null
     * @post returns (0-origin) index of value,
     *   or -1 if value is not found
     * 
     * @param value value sought.
     * @return index (0 is first element) of value, or -1
     */
    public int lastIndexOf(E value);

    /**
     * Get value at location i.
     *
     * @pre 0 <= i < size()
     * @post returns object found at that location
     *
     * @param i position of value to be retrieved.
     * @return value retrieved from location i (returns null if i invalid)
     */
    public E get(int i);

    /**
     * Set value stored at location i to object o, returning old value.
     *
     * @pre 0 <= i < size()
     * @post sets ith entry of list to value o;
     *    returns old value
     * @param i location of entry to be changed.
     * @param o new value
     * @return former value of ith entry of list.
     */
    public E set(int i, E o);

    /**
     * Insert value at location.
     *
     * @pre 0 <= i <= size()
     * @post adds ith entry of list to value o
     * @param i index of this new value
     * @param o value to be stored
     */
    public void add(int i, E o);

    /**
     * Remove and return value at location i.
     *
     * @pre 0 <= i < size()
     * @post removes and returns object found at that location
     *
     * @param i position of value to be retrieved.
     * @return value retrieved from location i (returns null if i invalid)
     */
    public E remove(int i);

}
