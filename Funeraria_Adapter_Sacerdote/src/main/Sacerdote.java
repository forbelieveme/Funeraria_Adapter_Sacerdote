package main;

public class Sacerdote {
	
	protected String nombre;
	protected String ritual;
	
	public Sacerdote(String nombre, String ritual) {
		this.nombre=nombre;
		this.ritual=ritual;
	}

	public String getRitual() {
		return ritual;
	}

	public void setRitual(String ritual) {
		this.ritual = ritual;
	}

	public String getNombre() {
		return nombre;
	}

	
}
