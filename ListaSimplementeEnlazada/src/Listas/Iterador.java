package Listas;
import java.util.Iterator;

/**
 * 
 */

/**
 * @author flaquitqm
 *
 */
public  abstract class Iterador<E> implements Iterator<E>{

	@Override
	public abstract boolean hasNext();

	@Override
	public abstract E next();
	
	
	public abstract E get();
	public abstract void reset();


}
