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
    public int size();

    /**
     * Determina si la lista está vacía.
     *
     * @post devuelve true si la lista if no tiene elementos
     *
     * @return True si la lista no tiene elementos.
     */
    public boolean isEmpty();

    /**
     * Quita todos los elementos de la lista
     *
     * @post vacía la lista
     */
    public void clear();

    /**
     * Inserta un elemento al inicio de la lista.
     *
     * @post El valor es añadido al inicio de la lista
     * 
     * @param valor El valor que se añade al inicio de la lista
     */
    public void addFirst(E value);

    /**
     * Añade un valor en la cola de la lista (al final)
     *
     * @post un valor es añadido al final de la lista
     * 
     * @param valor El valor que se añade al final de la lista.
     */
    public void addLast(E value);

    /**
     * Obtiene el primer elemento de la lista
     *
     * @pre la lista no está vacía
     * @post devuelve el primer valor de la lista
     * 
     * @return Una referencia al primer valor de la lista.
     */
    public E getFirst();

    /**
     * Obtiene el último elemento de la lista
     *
     * @pre la lista no estpa vacía
     * @post devuelve el último valor de la lista
     * 
     * @return una referencia al último elemento de la lista.
     */
    public E getLast();

    /**
     * Elimina un valor del primer elemento de la lista.
      *
      * @pre lista no está vacía
      * @post elimina el primer valor de la lista
      *
      * @return El valor realmente eliminado.
     */
    public E removeFirst();

    /**
      * Elimina el último valor de la lista.
      *
      * @pre la lista no está vacía
      * @post elimina el último valor de la lista
      *
      * @return El valor eliminado.
     */
    public E removeLast();

    /**
     * Eliminar un valor de la lista. A lo sumo un valor será eliminado.
      * @post elimina y devuelve el elemento igual al valor
      * De lo contrario devuelve nulo
      *
      * @param value El valor que se va a eliminar.
      * @return El valor eliminado.
     */
    public E remove(E value);

    /**
     * Agregar un objeto a la cola de la lista.
      *
      * @post valor se agrega a la cola de la lista
      *
      * @param value El valor que se agregará a la cola de la lista.
      * @see #addLast
     */
    public void add(E value);

    /**
     * Elimina el valor de la cola de la lista.
      *
      * @pre lista tiene al menos un elemento
      * @post elimina el último valor encontrado en la lista
      * @return objeto eliminado.
     */
    public E remove();

    /**
     * Recupera el valor de la cola de la lista.
      *
      * @pre lista tiene al menos un elemento
      * @post devuelve el último valor encontrado en la lista
      * @return objeto encontrado al final de la lista
     */
    
    public E get();

    /**
     * Comprueba si hay un valor en la lista.
      *
      * @pre valor no es nulo
      * @post devuelve True si la lista contiene un objeto igual a value
      *
      * Valor de value @param buscado.
      * @return True si el valor está dentro de la lista.
     */
    public boolean contains(E value);

    /**
     * Determinar la primera ubicación de un valor en la lista.
     *
     * @pre valor no es nulo
     * @post devuelve el índice de la primera ocurrencia de value o -1 si no se encuentra el valor
     * @param value El valor buscado.
     * Índice @return (0 es el primer elemento) de valor, o -1     
     */
    public int indexOf(E value);

    /**
     * Determinar la última ubicación de un valor en la lista.
      *
      * @pre value no es nulo
      * @post devuelve (0-origen) el índice de valor,
      * O -1 si no se encuentra el valor
      * Valor de valor @param buscado.
      * Índice @return (0 es el primer elemento) de valor, o -1
     */
    public int lastIndexOf(E value);

    /**
     * Obtener valor en la ubicación i.
      *
      * @pre 0 <= i <tamaño ()
      * @post devuelve el objeto encontrado en esa ubicación
      *
      * @param i posición de valor a recuperar.
      * @return valor recuperado de la ubicación i (devuelve null si no es válido)
     */
    public E get(int i);

    /**
      * Modifica el valor almacenado en la posición i en el objeto o, devolviendo el valor antiguo.
      *
      * @pre 0 <= i <tamaño ()
      * @post establece la entrada de la lista a valor o;
      * Devuelve el valor anterior
      * @param i ubicación de entrada a ser cambiado.
      * @param o nuevo valor
      * @return valor anterior de la entrada i de la lista.
     */
    public E set(int i, E o);

    /** 
     * Inserta el valor en la ubicación. 
     * @pre 0 <= i <= size () 
     * @post añade el valor o en la iesíma posición
     * @param i índice de este nuevo valor 
     * @param o valor a almacenar
     */
    public void add(int i, E o);

    /**
     * Eliminar y devolver valor en la ubicación i.
     *
     * @pre 0 <= i <tamaño ()
     * @post elimina y devuelve el objeto encontrado en esa ubicación
     *
     * @param i posición de valor a recuperar.
     * @return valor recuperado de la ubicación i (devuelve null si no es válido)
     */
    public E remove(int i);

}
