/**
 * 
 */

/**
 * @author flaquitqm
 *
 */
public interface ILista<E> {
	
	/**
     * Determina el tama�o de la lista.
     *
     * @post devuelve el n�mero de elementos en la lista
     * 
     * @return el n�mero de elementos de la lista.
     */
    public int size();

    /**
     * Determina si la lista est� vac�a.
     *
     * @post devuelve true si la lista if no tiene elementos
�����*
�����* @return True si la lista no tiene elementos.
     */
    public boolean isEmpty();

    /**
     * Quita todos los elementos de la lista
     *
     * @post vac�a la lista
     */
    public void clear();

    /**
     * Inserta un elemento al inicio de la lista.
     *
     * @post El valor es a�adido al inicio de la lista
     * 
     * @param valor El valor que se a�ade al inicio de la lista
     */
    public void addFirst(E value);

    /**
     * A�ade un valor en la cola de la lista (al final)
     *
     * @post un valor es a�adido al final de la lista
     * 
     * @param valor El valor que se a�ade al final de la lista.
     */
    public void addLast(E value);

    /**
     * Obtiene el primer elemento de la lista
     *
     * @pre la lista no est� vac�a
     * @post devuelve el primer valor de la lista
     * 
     * @return Una referencia al primer valor de la lista.
     */
    public E getFirst();

    /**
     * Obtiene el �ltimo elemento de la lista
     *
     * @pre la lista no estpa vac�a
     * @post devuelve el �ltimo valor de la lista
     * 
     * @return una referencia al �ltimo elemento de la lista.
     */
    public E getLast();

    /**
     * Elimina un valor del primer elemento de la lista.
����� *
����� * @pre lista no est� vac�a
����� * @post elimina el primer valor de la lista
����� *
����� * @return El valor realmente eliminado.
     */
    public E removeFirst();

    /**
����� * Elimina el �ltimo valor de la lista.
����� *
����� * @pre la lista no est� vac�a
����� * @post elimina el �ltimo valor de la lista
����� *
����� * @return El valor eliminado.
     */
    public E removeLast();

    /**
     * Eliminar un valor de la lista. A lo sumo un valor ser� eliminado.
����� * @post elimina y devuelve el elemento igual al valor
����� * De lo contrario devuelve nulo
����� *
����� * @param value El valor que se va a eliminar.
����� * @return El valor eliminado.
     */
    public E remove(E value);

    /**
     * Agregar un objeto a la cola de la lista.
����� *
����� * @post valor se agrega a la cola de la lista
����� *
����� * @param value El valor que se agregar� a la cola de la lista.
      * @see #addLast
     */
    public void add(E value);

    /**
     * Elimina el valor de la cola de la lista.
����� *
����� * @pre lista tiene al menos un elemento
����� * @post elimina el �ltimo valor encontrado en la lista
����� * @return objeto eliminado.
     */
    public E remove();

    /**
     * Recupera el valor de la cola de la lista.
����� *
����� * @pre lista tiene al menos un elemento
����� * @post devuelve el �ltimo valor encontrado en la lista
����� * @return objeto encontrado al final de la lista
     */
    public E get();

    /**
     * Comprueba si hay un valor en la lista.
����� *
����� * @pre valor no es nulo
����� * @post devuelve True si la lista contiene un objeto igual a value
����� *
����� * Valor de value @param buscado.
����� * @return True si el valor est� dentro de la lista.
     */
    public boolean contains(E value);

    /**
     * Determinar la primera ubicaci�n de un valor en la lista.
�����*
�����* @pre valor no es nulo
�����* @post devuelve el �ndice de la primera ocurrencia de value o -1 si no se encuentra el valor
�����* @param value El valor buscado.
�����* �ndice @return (0 es el primer elemento) de valor, o -1     
     */
    public int indexOf(E value);

    /**
     * Determinar la �ltima ubicaci�n de un valor en la lista.
����� *
����� * @pre value no es nulo
����� * @post devuelve (0-origen) el �ndice de valor,
����� * O -1 si no se encuentra el valor
����� * Valor de valor @param buscado.
����� * �ndice @return (0 es el primer elemento) de valor, o -1
     */
    public int lastIndexOf(E value);

    /**
     * Obtener valor en la ubicaci�n i.
����� *
����� * @pre 0 <= i <tama�o ()
����� * @post devuelve el objeto encontrado en esa ubicaci�n
����� *
����� * @param i posici�n de valor a recuperar.
����� * @return valor recuperado de la ubicaci�n i (devuelve null si no es v�lido)
     */
    public E get(int i);

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
    public E set(int i, E o);

    /** 
     * Inserta el valor en la ubicaci�n. 
     * @pre 0 <= i <= size () 
     * @post a�ade el valor o en la ies�ma posici�n
     * @param i �ndice de este nuevo valor 
     * @param o valor a almacenar
     */
    public void add(int i, E o);

    /**
     * Eliminar y devolver valor en la ubicaci�n i.
�����*
�����* @pre 0 <= i <tama�o ()
�����* @post elimina y devuelve el objeto encontrado en esa ubicaci�n
�����*
�����* @param i posici�n de valor a recuperar.
�����* @return valor recuperado de la ubicaci�n i (devuelve null si no es v�lido)
     */
    public E remove(int i);

}
