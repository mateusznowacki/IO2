package main.Model;

public class Obywatel {

	private String Imie;
	private String Nazwisko;
	private String Pesel;
	private String Data_urodzenia;
	private String Data_Smierci;
	private Plec Plec;
	private Obywatel Matka;
	private Obywatel Ojciec;
	private Obywatel Partner;
	private Obywatel[] Dzieci;
	private Lokalizacja Adres_zameldowania;
	private Lokalizacja Adres_zamieszkania;
	private Stan_cywilny Stan_Cywilny;
	private String Kraj_Urodzenia;

	public Obywatel(String imie,String nazwisko,String pesel){
		this.Imie = imie;
		this.Nazwisko = nazwisko;
		this.Pesel = pesel;
	}

	public String getKraj_Urodzenia() {
		return this.Kraj_Urodzenia;
	}

	public String getImie() {
		return this.Imie;
	}

	/**
	 * 
	 * @param Imie
	 */
	public void setImie(String Imie) {
		this.Imie = Imie;
	}

	public String getNazwisko() {
		return this.Nazwisko;
	}

	/**
	 * 
	 * @param Nazwisko
	 */
	public void setNazwisko(String Nazwisko) {
		this.Nazwisko = Nazwisko;
	}

	public String getPesel() {
		return this.Pesel;
	}

	/**
	 * 
	 * @param Pesel
	 */
	public void setPesel(String Pesel) {
		// TODO - implement Obywatel.setPesel
		throw new UnsupportedOperationException();
	}

	public String getData_urodzenia() {
		return this.Data_urodzenia;
	}

	/**
	 * 
	 * @param Data_urodzenia
	 */
	public void setData_urodzenia(String Data_urodzenia) {
		this.Data_urodzenia = Data_urodzenia;
	}

	public String getData_Smierci() {
		return this.Data_Smierci;
	}
	/**
	 * 
	 * @param Data_Smierci
	 */
	public void setData_Smierci(String Data_Smierci) {
		this.Data_Smierci = Data_Smierci;
	}

	public void getAttribute() {
		// TODO - implement Obywatel.getAttribute
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param attribute
	 */
	public void setAttribute(int attribute) {
		// TODO - implement Obywatel.setAttribute
		throw new UnsupportedOperationException();
	}

	public Obywatel getMatka() {
		// TODO - implement Obywatel.getMatka
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param Matka
	 */
	public void setMatka(Obywatel Matka) {
		// TODO - implement Obywatel.setMatka
		throw new UnsupportedOperationException();
	}

	public Obywatel getOjciec() {
		// TODO - implement Obywatel.getOjciec
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param Ojciec
	 */
	public void setOjciec(Obywatel Ojciec) {
		// TODO - implement Obywatel.setOjciec
		throw new UnsupportedOperationException();
	}

	public Obywatel getPartner() {
		// TODO - implement Obywatel.getPartner
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param Partner
	 */
	public void setPartner(Obywatel Partner) {
		// TODO - implement Obywatel.setPartner
		throw new UnsupportedOperationException();
	}

	public Obywatel[] getDzieci() {
		// TODO - implement Obywatel.getDzieci
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param Dzieci
	 */
	public void setDzieci(Obywatel[] Dzieci) {
		// TODO - implement Obywatel.setDzieci
		throw new UnsupportedOperationException();
	}

}