package Listas;

public class Profesor {
	private String nombre;
	private int edad;
	private String catDoc;
	private String especialidad; //grado cientifico
	private String puesto;
	/**
	 * 
	 */
	public Profesor() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param nombre
	 * @param edad
	 * @param catDoc
	 * @param especialidad
	 * @param puesto
	 */
	public Profesor(String nombre, int edad, String catDoc, String especialidad, String puesto) {
		this.nombre = nombre;
		this.edad = edad;
		this.catDoc = catDoc;
		this.especialidad = especialidad;
		this.puesto = puesto;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}
	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}
	/**
	 * @return the catDoc
	 */
	public String getCatDoc() {
		return catDoc;
	}
	/**
	 * @param catDoc the catDoc to set
	 */
	public void setCatDoc(String catDoc) {
		this.catDoc = catDoc;
	}
	/**
	 * @return the especialidad
	 */
	public String getEspecialidad() {
		return especialidad;
	}
	/**
	 * @param especialidad the especialidad to set
	 */
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	/**
	 * @return the puesto
	 */
	public String getPuesto() {
		return puesto;
	}
	/**
	 * @param puesto the puesto to set
	 */
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Profesor [nombre=" + nombre + ", edad=" + edad + ", catDoc=" + catDoc + ", especialidad=" + especialidad
				+ ", puesto=" + puesto + "]";
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((catDoc == null) ? 0 : catDoc.hashCode());
		result = prime * result + edad;
		result = prime * result + ((especialidad == null) ? 0 : especialidad.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((puesto == null) ? 0 : puesto.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Profesor other = (Profesor) obj;
		if (catDoc == null) {
			if (other.catDoc != null)
				return false;
		} else if (!catDoc.equals(other.catDoc))
			return false;
		if (edad != other.edad)
			return false;
		if (especialidad == null) {
			if (other.especialidad != null)
				return false;
		} else if (!especialidad.equals(other.especialidad))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (puesto == null) {
			if (other.puesto != null)
				return false;
		} else if (!puesto.equals(other.puesto))
			return false;
		return true;
	}
	
	
}
