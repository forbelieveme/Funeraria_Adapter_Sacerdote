package adapter;

import ritual.Cristianismo;
import ritual.Judaismo;

public class Adapter_Cristianismo extends Judaismo {

	Cristianismo cristianismo;

	public Adapter_Cristianismo(Cristianismo cristianismo) {
		this.cristianismo = cristianismo;
	}

	public String orar() {
		return cristianismo.orar();
	}

	public String bendecir() {
		return cristianismo.bendecir();
	}
	
	public String descripcionRitual() {
		return cristianismo.descripcionRitual();
	}

}
