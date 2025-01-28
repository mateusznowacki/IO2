package model;



import prezenter.Wniosek;

import java.util.Vector;

public class KolejkaWnioskow {

	private Vector<Wniosek> Wnioski;

	public KolejkaWnioskow() {
		Wnioski = new Vector<Wniosek>();
	}

	public void DodajWniosek(Wniosek Wniosek) {
		Wnioski.add(Wniosek);
	}

	public Wniosek grabFirstWniosek() {
		Wniosek w = Wnioski.firstElement();
		Wnioski.removeFirst();
		return w;
	}

	public boolean is_queue_empty() {
		return Wnioski.isEmpty();
	}

	public Vector<Wniosek> GetWnioski() {
		return Wnioski;
	}
}