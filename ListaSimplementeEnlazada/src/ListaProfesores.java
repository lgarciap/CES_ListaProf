
public class ListaProfesores {
	private ListaSimplementeEnlazada<Profesor> listaCatedraticos;
	//private ListaSecuencial<Profesor> listaCat;
	
	public ListaProfesores(){
		listaCatedraticos = new ListaSimplementeEnlazada<Profesor>();
		//listaCatedraticos = new ListaSecuencial<Profesor>(5);
	}
	
	public void adicionarProfesor(String nombre, int edad, String catDoc, String especialidad, String puesto){
		
	}
}
