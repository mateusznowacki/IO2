package main.Model;

import java.util.Vector;

public class AdapterBazyDanych {

	private String DB_URL;
	private String KluczDostepu;
	private String OracleSQLHandle;
	private static AdapterBazyDanych instance;
	private Vector<Obywatel> obywatele;


	private AdapterBazyDanych() {
		obywatele = new Vector<Obywatel>();
		obywatele.add(new Obywatel("Pawel", "Kowalski","1"));
		obywatele.add(new Obywatel("Wanda", "Wandowska","2"));
		obywatele.add(new Obywatel("Kuba", "Kubowski","123"));

	}

	public static AdapterBazyDanych getInstance() {
		if (instance == null) {
			instance = new AdapterBazyDanych();
		}
		return instance;
	}

	/**
	 * 
	 * @param instance_obywatel
	 */
	public void DodajObywatela(Obywatel instance_obywatel) {
		// TODO - implement AdapterBazyDanych.DodajObywatela
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param PESEL
	 */
	public void UsunObywatel(String PESEL) {
		// TODO - implement AdapterBazyDanych.UsunObywatel
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param PESEL
	 * @param ObywatelZmodyfikowany
	 */
	public void ModyfikujObywatela(String PESEL, Obywatel ObywatelZmodyfikowany) {
		for (Obywatel ob : obywatele) {
			if (ob.getPesel().equals(PESEL)) {
				ob.setImie(ObywatelZmodyfikowany.getImie());
				ob.setNazwisko(ObywatelZmodyfikowany.getNazwisko());
				ob.setData_urodzenia(ObywatelZmodyfikowany.getData_urodzenia());
				ob.setData_Smierci(ObywatelZmodyfikowany.getData_Smierci());
			}
		}
	}

	/**
	 * 
	 * @param PESEL
	 */
	public Obywatel OdczytajObywatela(String PESEL) {
		for (Obywatel ob : obywatele) {
			if (ob.getPesel().equals(PESEL)) {
				return ob;
			}
		}
		return null;
	}

	public void getAttribute() {
		// TODO - implement AdapterBazyDanych.getAttribute
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param attribute
	 */
	public void setAttribute(int attribute) {
		// TODO - implement AdapterBazyDanych.setAttribute
		throw new UnsupportedOperationException();
	}

	public static AdapterBazyDanych getBazaDanych() {
		// TODO - implement AdapterBazyDanych.getBazaDanych
		throw new UnsupportedOperationException();
	}
	public void StworzKopieDanych() {
		// TODO - implement AdapterBazyDanych.StworzKopieDanych
		throw new UnsupportedOperationException();
	}
	public void StworzKopieCertyfikatuNarodzinSmierci () {
		// TODO - implement AdapterBazyDanych. StworzKopieCertyfikatuNarodzinSmierci
		throw new UnsupportedOperationException();
	}


}