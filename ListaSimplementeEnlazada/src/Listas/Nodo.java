package Listas;
/**
 * 
 */

/**
 * @author flaquitqm
 *
 */
public class Nodo<E> {
	protected E valor;
	protected Nodo<E> siguiente;
	/**
	 * @param valor
	 * @param siguiente
	 */
	public Nodo(E valor, Nodo<E> siguiente) {
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
	@Override
	public String toString() {
		return "Nodo [valor=" + valor + ", siguiente=" + siguiente + "]";
	}
	
	
	
}
