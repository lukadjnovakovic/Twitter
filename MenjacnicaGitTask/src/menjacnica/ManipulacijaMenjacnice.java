package menjacnica;

import java.util.LinkedList;

import interfejs.InterfaceMenjacnice;
import menjacnica.valute.Valuta;

public class ManipulacijaMenjacnice implements InterfaceMenjacnice {

	@Override
	public void dodajKurs(double a,double b,double c) {
		Valuta nova = new Valuta();
		nova.setNaziv("nepoznato");
		nova.setSkraceniNaziv("nepoznato");
		nova.setKupovniKurs(a);
		nova.setProdajniKurs(b);
		nova.setSrednjiKurs(c);
	}

	@Override
	public void obrisiKurs(double a,double b,double c,LinkedList<Valuta> valute) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double pronadjiKurs(double a,double b,double c,LinkedList<Valuta> valute) {
		// TODO Auto-generated method stub
		return 0;
	}

}
