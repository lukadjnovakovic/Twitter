package interfejs;

import java.util.LinkedList;

import menjacnica.valute.Valuta;

public interface InterfaceMenjacnice {
	
	public void dodajKurs(double a,double b,double c);
	public void obrisiKurs(double a,double b,double c,LinkedList<Valuta> valute);
	public double pronadjiKurs(double a,double b,double c,LinkedList<Valuta> valute);
	
	
}
