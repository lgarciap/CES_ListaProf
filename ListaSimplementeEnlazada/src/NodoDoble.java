/**
 * 
 */

/**
 * @author flaquitqm
 *
 */
public class NodoDoble<E> extends Nodo<E> {
	
	private NodoDoble<E> anterior;
	
	public NodoDoble(E valor) {
		super(valor);
		anterior = null;
	}

	/**
	 * @param valor
	 * @param siguiente
	 * @param anterior
	 */
	public NodoDoble(E valor, Nodo<E> siguiente, NodoDoble<E> anterior) {
		super(valor, siguiente);
		this.anterior = anterior;
	}

	/**
	 * @return the anterior
	 */
	public NodoDoble<E> getAnterior() {
		return anterior;
	}

	/**
	 * @param anterior the anterior to set
	 */
	public void setAnterior(NodoDoble<E> anterior) {
		this.anterior = anterior;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "NodoDoble [anterior=" + anterior + "]";
	}
	


}
