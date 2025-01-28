package widok;


import model.Obywatel;
import prezenter.Wniosek;
import prezenter.WniosekOAktualizacjeDanych;

import java.util.Objects;
import java.util.Scanner;


public class WidokObywatela implements InterfejsWidoku{


	/**
	 * @param w wniosek do uzupełnienia
	 */
	@Override
	public void WyswietlFormularz(Wniosek w) {
		for (String pole : w.getkeys())	{
			if (w instanceof WniosekOAktualizacjeDanych && pole.equals("Pesel")){
				continue;
			}
			w.setkey(pole,PobierzDaneZKonsoli("Prosze uzupełnij pole " + pole + " : "));
		}
	}

	/**
	 * @param obywatel obywatel do wyswietlenia
	 */
	@Override
	public void WyswietlObywatela(Obywatel obywatel) {
		WyswietlKomunikat("Imię : " + obywatel.getImie());
		WyswietlKomunikat("Nazwisko : " + obywatel.getNazwisko());
//		WyswietlKomunikat("Data Narodzin : " + obywatel.getData_urodzenia());
		if (!Objects.equals(obywatel.getData_Smierci(), null)){
			WyswietlKomunikat("Data Śmierci : " + obywatel.getData_Smierci());
		}
		else {
			WyswietlKomunikat("Obywatel jeszcze żyje");
		}
	}

	/**
	 * @param komunikat komunikat do wyswietlenia
	 */
	@Override
	public void WyswietlKomunikat(String komunikat) {
		System.out.println(komunikat);
	}

	/**
	 * @param pytanie komunikat do wyswietlenia otaczajacy input
	 * @return zwraca string z konsoli
	 */
	@Override
	public String PobierzDaneZKonsoli(String pytanie) {
		System.out.print(pytanie);
		Scanner scanner = new Scanner(System.in);
		return scanner.nextLine();
	}
}