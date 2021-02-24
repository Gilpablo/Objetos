package herencias;

public final class Alumno extends Personal{
	private String curso;

	public Alumno(String nombre, int edad, String curso) {
		super(nombre, edad);
		this.curso = curso;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return super.getNombre().toUpperCase();
	}

	@Override
	public String toString() {
		
		return " Alumno [curso=" + curso + "] " + super.toString();
	}
	
	
	
}