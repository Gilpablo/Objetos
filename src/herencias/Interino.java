package herencias;

public final class Interino extends Administrativos{
	private String tiempo;

	public Interino(String nombre, int edad, String cargo, String tiempo) {
		super(nombre, edad, cargo);
		this.tiempo = tiempo;
	}

	public String getTiempo() {
		return tiempo;
	}

	public void setTiempo(String tiempo) {
		this.tiempo = tiempo;
	}

	@Override
	public String toString() {
		return "Interino [tiempo=" + tiempo + "]";
	}
	
	
}