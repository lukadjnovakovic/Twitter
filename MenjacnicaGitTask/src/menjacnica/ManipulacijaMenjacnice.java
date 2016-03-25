package menjacnica;

import java.util.LinkedList;

import interfejs.InterfaceMenjacnice;
import menjacnica.valute.Valuta;

public class ManipulacijaMenjacnice implements InterfaceMenjacnice {

	@Override
	public void dodajKurs(double a, double b, double c) {
		// TODO Auto-generated method stub
		Valuta v = new Valuta();
		v.setKupovniKurs(a);
		v.setProdajniKurs(b);
		v.setSrednjiKurs(c);
		
	}

	@Override
	public void obrisiKurs(double a, double b, double c, LinkedList<Valuta> valute) {
		// TODO Auto-generated method stub
		for(int i = 0; i<valute.size(); i++){
			if(valute.get(i).getKupovniKurs()==a && valute.get(i).getProdajniKurs()==b && valute.get(i).getSrednjiKurs() == c ){
				valute.remove(i);
			}
		}
		
	}

	@Override
	public Valuta pronadjiKurs(double a, double b, double c, LinkedList<Valuta> valute) {
		for(int i = 0; i<valute.size(); i++){
			if(valute.get(i).getKupovniKurs()==a && valute.get(i).getProdajniKurs()==b && valute.get(i).getSrednjiKurs() == c ){
				return valute.get(i);
			}
		}
		return null;
	}
}
