package model;


import prezenter.Wniosek;
import prezenter.WniosekOAktualizacjeDanych;
import prezenter.WniosekOSmierc;

public class Model implements InterfejsModelu {
    KolejkaWnioskow kolejka;

    public Model() {
        kolejka = new KolejkaWnioskow();
    }

    private boolean WykonajWniosek(Wniosek w) {
        if (w instanceof WniosekOSmierc) {
            Obywatel obw = ZnajdzObywatela(w.getkey("pesel"));
            if (obw != null) {
                obw.setData_Smierci(w.getkey("datasmierci"));
                return true;
            }
            else{
                return false;
            }
        } else if (w instanceof WniosekOAktualizacjeDanych) {
            Obywatel obw = ZnajdzObywatela(w.getkey("pesel"));
            if (obw != null) {
                obw.setImie(w.getkey("imie"));
                obw.setNazwisko(w.getkey("nazwisko"));
                obw.setData_urodzenia(w.getkey("dataurodzenia"));
                return true;
            }
            else{
                return false;
            }
        }
        return false;
    }

    public boolean WykonajPierwszyWniosekWKolejce() {
        if (kolejka.is_queue_empty()) {
            return false;
        }
        Wniosek w = kolejka.grabFirstWniosek();
        return WykonajWniosek(w);
    }


    /**
     * @param pesel pesel obywatela ktorego szukamy
     * @return Obywatel
     *
     */
    @Override
    public Obywatel ZnajdzObywatela(String pesel) {
        FabrykaObywateli fo = new FabrykaObywateli();
        return fo.ZnajdzObywatela(pesel);
    }

    @Override
    public boolean DodajWniosekDoKolejki(Wniosek w) {
        kolejka.DodajWniosek(w);
        return true;
    }
}
