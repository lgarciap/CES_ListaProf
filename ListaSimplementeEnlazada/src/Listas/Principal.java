package Listas;
import java.text.Normalizer.Form;

/**
 * 
 */

/**
 * @author flaquitqm
 *
 */

public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ListaProfesores listaU = new ListaProfesores(4);
		
		//b. Ingresar un profesor al final de la lista.
		listaU.adicionarProfesor("Lynette", 33, "Instructor", "Informatica", "catedratica");
		listaU.adicionarProfesor("Zayda", 61, "Titular", "Matematica", "catedratica");
		listaU.adicionarProfesor("Andres", 67, "Asistente", "Ingles", "catedratico");
		listaU.adicionarProfesor("Tony", 67, "Instructor", "Biologia", "catedratica");
		
		//a. Determinar si un profesor está en la lista o no.
		System.out.println(listaU.profesorEnLista("Andres", 67, "Asistente", "Ingles", "catedratico"));
		
		//c. Dada una categoría científica y una edad obtener el nombre del primer profesor (si existe) que tenga esa categoría y que tenga como mínimo esa edad.
		System.out.println(listaU.primerProfe("Titular", 61));
		
		//d. Obtener todos los profesores que tengan la mayor edad en el departamento.  
		System.out.println(listaU.profesConMayorEdad());
		
	}
	
	

}
