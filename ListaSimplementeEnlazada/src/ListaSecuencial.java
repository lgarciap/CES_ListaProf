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
	public int tamanio() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public boolean estaVacia() {
		// TODO Auto-generated method stub
		if (cantElementos == 0)
			return true;
		else
			return false;
	}
	
	
	
}
