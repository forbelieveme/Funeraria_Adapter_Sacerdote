package main;

import adapter.Adapter_Judaismo;
import ritual.Cristianismo;
import ritual.Funeral_Cristiano;
import ritual.Funeral_Judio;
import singleton.Impresora;

public class Prueba_Sacerdote_Adapter {

	public static void main(String[] args) {

		Funeral_Cristiano funeralCristiano = new Funeral_Cristiano();

		Funeral_Judio funeralJudio = new Funeral_Judio();

		Sacerdote sacerdote = new Sacerdote("Pepito", funeralCristiano.descripcionRitual());

		Impresora.getInstance().imprimir(sacerdote.getRitual());
		Impresora.getInstance().imprimir(funeralCristiano.bendecir());
		Impresora.getInstance().imprimir(funeralCristiano.orar());
		
		Cristianismo adapterJudaismo = new Adapter_Judaismo(funeralJudio);
		
		sacerdote.setRitual(adapterJudaismo.descripcionRitual());

		Impresora.getInstance().imprimir(sacerdote.getRitual());
		Impresora.getInstance().imprimir(adapterJudaismo.bendecir());
		Impresora.getInstance().imprimir(adapterJudaismo.orar());

	}

}
