package adapter;

import ritual.Cristianismo;
import ritual.Judaismo;

public class Adapter_Judaismo extends Cristianismo{

	Judaismo judaismo;

	public Adapter_Judaismo(Judaismo judaismo) {
		this.judaismo = judaismo;
	}
	
	public String orar() {
		return judaismo.orar();
	}

	public String bendecir() {
		return judaismo.bendecir();
	}
	
	public String descripcionRitual() {
		return judaismo.descripcionRitual();
	}
	
	
}
