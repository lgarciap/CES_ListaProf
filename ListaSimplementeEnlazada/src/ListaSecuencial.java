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
		this.tamanio = tamanio;
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
		return tamanio;
	}
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if(cantElementos > 0)
		{
			return false;
		}
		else
		{
			return true;
		}
		
	}
	@Override
	public void clear() {
		// TODO Auto-generated method stub
		arreglo = null;
		this.cantElementos = 0;
	}
	@Override
	public void addFirst(Object value) {
		// TODO Auto-generated method stub
		if(tamanio > cantElementos)
		{
			arreglo[cantElementos] = (E)value;
			for (int i = cantElementos; i > 0; i--) {
				E temp = arreglo[cantElementos];
				arreglo[cantElementos] = arreglo[cantElementos - 1];
				arreglo[cantElementos - 1] = temp;
			}
			cantElementos++;
			
		}
		
		
	}
	@Override
	public void addLast(Object value) {
		// TODO Auto-generated method stub
		if(tamanio > cantElementos)
		{
			arreglo[cantElementos] = (E)value;
			cantElementos++;
		}
		
	}
	@Override
	public E getFirst() {

		// TODO Auto-generated method stub
		return arreglo[0];
	}
	@Override
	public E getLast() {
		// TODO Auto-generated method stub
		return arreglo[tamanio-1];
	}
	@Override
	public E removeFirst() {
		// TODO Auto-generated method stub
		arreglo[0] = null;
		return (E)arreglo;
	}
	@Override
	public E removeLast() {
		// TODO Auto-generated method stub
		arreglo[cantElementos-1] = null;
		return (E)arreglo;
	}
	@Override
	public E remove(E value) {

		// TODO Auto-generated method stub
		for(int i=0 ; i < arreglo.length;i++)
		{
			if(arreglo[i] == value)
			{
				arreglo[i] = null;
				
			}
			
			
		}
		return (E)arreglo;
		
	}
	@Override
	public void add(E value) {
		// TODO Auto-generated method stub
		
		if(tamanio > cantElementos)
		{
			arreglo[cantElementos] = (E)value;
			cantElementos++;
		}
		
		
	}
	@Override
	public E remove() {
		// TODO Auto-generated method stub
		if(cantElementos>0)
		{
			arreglo[cantElementos-1] = null;
			return (E)arreglo;
		}
		else
		{
			return (E)"Vacio";
		}
	}
	@Override
	public E get() {
		// TODO Auto-generated method stub
		if(cantElementos>0)
		{
			return (E)arreglo[cantElementos-1];
		}
		else
		{
			return null;
		}
	}
	@Override
	public boolean contains(E value) {
		// TODO Auto-generated method stub
		boolean resultado = false;
		for(int i=0 ; i < arreglo.length;i++)
		{
			if(arreglo[i] == value)
			{
				resultado = true;
				i = arreglo.length;
			}
			else
			{
				resultado = false;
			}
			
		}
		return resultado;
		
	}
	@Override
	public int indexOf(E value) {
		int resultado = 0;
		for(int i=0 ; i < arreglo.length;i++)
		{
			if(arreglo[i] == value)
			{
				resultado = i;
				i = arreglo.length;
			}
			else
			{
				resultado = -1;
			}
			
		}
		return resultado;
		
		
	}
	@Override
	public int lastIndexOf(E value) {
		int resultado = 0;
		for(int i=cantElementos-1 ; i < arreglo.length;i--)
		{
			if(arreglo[i] == value)
			{
				resultado = i;
				i = arreglo.length+1;
			}
			else
			{
				resultado = -1;
			}
			
		}
		return resultado;
		
	}
	@Override
	public E get(int i) {
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
		for(int j=0 ; j < arreglo.length;j++)
		{
			if(i< arreglo.length)
			{
				if(arreglo[j] == arreglo[i])
				{
					arreglo[j] = null;
					
				}
				else
				{
					return null;
				}
			}
		}
		return (E)arreglo;
	}
		
	
	
}
