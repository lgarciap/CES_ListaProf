package Listas;
import java.util.Iterator;

/**
 * @author flaquitqm
 *
 */
public class ListaProfesores {
	private ListaSimplementeEnlazada<Profesor> listaCatedraticos;
	//private ListaSecuencial<Profesor> listaCatedraticos;
	
	public ListaProfesores(int tamanio){
		//listaCatedraticos = new ListaSecuencial<Profesor>(tamanio);
		listaCatedraticos = new ListaSimplementeEnlazada<Profesor>();  
	}
	
	
	/**
	 * Ingresa un profesor a la lista
	 * @param nombre (el nombre del profesor)
	 * @param edad (la edad del profesor)
	 * @param catDoc (la categortía docente del profesor)
	 * @param especialidad (la especialidad del profesor)
	 * @param puesto (el puesto del profesor)
	 */
	public void adicionarProfesor(String nombre, int edad, String catDoc, String especialidad, String puesto){
		Profesor nuevoProfe = new Profesor(nombre, edad, catDoc, especialidad, puesto);
		listaCatedraticos.add(nuevoProfe);
	}
	
	/** 
	 * Devuelve true si el profesor ya existe en la lista, false en caso contrario 
	 * @param nombre (el nombre del profesor)
	 * @param edad (la edad del profesor)
	 * @param catDoc (la categortía docente del profesor)
	 * @param especialidad (la especialidad del profesor)
	 * @param puesto (el puesto del profesor)
	 * @return true o false
	 */
	public boolean profesorEnLista(String nombre, int edad, String catDoc, String especialidad, String puesto){
		Profesor nuevoProfe = new Profesor(nombre, edad, catDoc, especialidad, puesto);
		return listaCatedraticos.contains(nuevoProfe);
	}
	
	/**
	 * Devuelve el nombre del primer profesor que cumple con la edad y la categoria docente indicada
	 * @param catDoc
	 * @param edad
	 * @return el nombre del profesor
	 */
	public String primerProfe(String catDoc, int edad){
		listaCatedraticos.reiniciarIterador();
		while (listaCatedraticos.tieneSiguiente()){
			Profesor profeAc = listaCatedraticos.elementoActual();
			if (profeAc.getEdad()== edad && profeAc.getCatDoc().equals(catDoc) ){
				return profeAc.getNombre();
			}
			listaCatedraticos.siguiente();
		}
		return null;
	}
	
	public int obtenerMayorEdad(){
		int mayor = 0;
		listaCatedraticos.reiniciarIterador();
		while (listaCatedraticos.tieneSiguiente()){
			Profesor profeAc = listaCatedraticos.elementoActual();
			if (profeAc.getEdad() > mayor)
				mayor = profeAc.getEdad();
			listaCatedraticos.siguiente();
		}
		return mayor;
	}
	public Object profesConMayorEdad(){
		//ListaSecuencial<Profesor> profesViejos = new ListaSecuencial<Profesor>(listaCatedraticos.size());
		ListaSimplementeEnlazada<Profesor> profesViejos = new ListaSimplementeEnlazada<Profesor>();
		int mayorEdad = obtenerMayorEdad();
		listaCatedraticos.reiniciarIterador();
		int i = 0;
		while (i<listaCatedraticos.size() && listaCatedraticos.elementoActual()!=null){
			Profesor profeAc = listaCatedraticos.elementoActual();
			if (profeAc.getEdad()== mayorEdad){
				profesViejos.add(profeAc);
			}
			listaCatedraticos.siguiente();
			i++;
		}
		return profesViejos;
	}
	
}
