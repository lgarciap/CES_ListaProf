/**
 * 
 */

/**
 * @author flaquitqm
 *
 */
public class Nodo<E> {
	private E valor;
	private Nodo siguiente;
	/**
	 * @param valor
	 * @param siguiente
	 */
	public Nodo(E valor, Nodo siguiente) {
		this.valor = valor;
		this.siguiente = siguiente;
	}
	/**
	 * @param valor
	 */
	public Nodo(E valor) {
		this.valor = valor;
		siguiente = null;
	}
	/**
	 * @return the valor
	 */
	public E getValor() {
		return valor;
	}
	/**
	 * @param valor the valor to set
	 */
	public void setValor(E valor) {
		this.valor = valor;
	}
	/**
	 * @return the siguiente
	 */
	public Nodo getSiguiente() {
		return siguiente;
	}
	/**
	 * @param siguiente the siguiente to set
	 */
	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString(){
		return valor.toString();			
	}
	
}
