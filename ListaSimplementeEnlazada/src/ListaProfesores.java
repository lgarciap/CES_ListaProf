
public class ListaProfesores {
	//private ListaSimplementeEnlazada<Profesor> listaCat;
	private ListaSecuencial<Profesor> listaCat;
	
	public ListaProfesores(){
		if (listaCat.estaVacia())
			System.out.println("Yey!!!");
	}
}
