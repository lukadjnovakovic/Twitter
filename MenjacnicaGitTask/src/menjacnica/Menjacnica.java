package menjacnica;

import java.util.LinkedList;

import menjacnica.valute.Valuta;

public class Menjacnica {

	LinkedList<Valuta> valute = new LinkedList<Valuta>();

	public LinkedList<Valuta> getValute() {
		return valute;
	}

	public void setValute(LinkedList<Valuta> valute) {
		this.valute = valute;
	}
	
}
