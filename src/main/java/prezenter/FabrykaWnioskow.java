package prezenter;

public class FabrykaWnioskow {

	/**
	 * 
	 * @param typwniosku jaki wniosek chcemy stworzyc
	 */
	public Wniosek StworzWniosek(TypWniosku typwniosku) {
		if(typwniosku == null) {
			return null;
		}
		switch (typwniosku){
			case AKTUALIZACJA_DANCYH:{
				WniosekOAktualizacjeDanych wk = new WniosekOAktualizacjeDanych();
				wk.setkey("pesel", "");
				wk.setkey("dataurodzenia", "");
				wk.setkey("imie", "");
				wk.setkey("nazwisko", "");
				return wk;
			}
			case KOPIA_DANYCH:
			{
				WniosekOKopieDanych wk = new WniosekOKopieDanych();
				wk.setkey("pesel", "");
				return wk;
			}
			case NARODZINY:{
				throw new UnsupportedOperationException();
			}
			case ZGON:{
				WniosekOSmierc wk = new WniosekOSmierc();
				wk.setkey("pesel", "");
				wk.setkey("datasmierci", "");
				return wk;
			}
			default:
				return null;
		}
	}
}