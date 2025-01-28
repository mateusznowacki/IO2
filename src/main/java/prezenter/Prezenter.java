package main.Prezenter;

import main.Model.InterfejsModelu;
import main.Model.Model;
import main.Model.Obywatel;
import main.Widok.InterfejsWidoku;
import main.Widok.WidokObywatela;

public class Prezenter {
    private final FabrykaWnioskow fabrykaWnioskow;
    private final InterfejsModelu model;
    private final InterfejsWidoku widok;
    private boolean zyc = true;

    public Prezenter(InterfejsWidoku widok, InterfejsModelu model) {
        fabrykaWnioskow = new FabrykaWnioskow();
        this.model = model;
        this.widok = widok;
    }


    public TypWniosku DajObywatelowiWyborWniosku() {
        widok.WyswietlKomunikat("Wybierz typ wniosku: ");
        widok.WyswietlKomunikat("1. Aktualizacja danych");
        widok.WyswietlKomunikat("2. Śmierć Obywatela");
        widok.WyswietlKomunikat("3. Kopia danych");
        widok.WyswietlKomunikat("4. Wykonaj akcje urzędnika");
        widok.WyswietlKomunikat("5. Wyjdz");
        int wybor = -1;
        while (wybor < 1 || wybor > 4) {
            wybor = Integer.parseInt(widok.PobierzDaneZKonsoli("Wybierz numer wniosku: "));
            if (wybor == 5){
                zyc = false;
                return null;
            }
            if (wybor < 1 || wybor > 4) {
                widok.WyswietlKomunikat("Nie ma takiego numeru wniosku. Wybierz ponownie.");
            }
        }
        switch (wybor) {
            case 1:
                return TypWniosku.AKTUALIZACJA_DANCYH;
            case 2:
                return TypWniosku.ZGON;
            case 3:
                return TypWniosku.KOPIA_DANYCH;
            case 4:
                if(model.WykonajPierwszyWniosekWKolejce()){
                    widok.WyswietlKomunikat("Poprawnie wykonano wniosek");
                }else {
                    widok.WyswietlKomunikat("Wniosek niewykonany albo kolejka pusta");
                }
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }


    public boolean WykonajWniosekObywatela() {
        TypWniosku typwniosku = DajObywatelowiWyborWniosku();
        if (typwniosku == null){
            return true;
        }
        Wniosek wniosek = fabrykaWnioskow.StworzWniosek(typwniosku);
        widok.WyswietlFormularz(wniosek);
        switch (typwniosku) {
            case KOPIA_DANYCH -> {
                Obywatel znobyw = model.ZnajdzObywatela(wniosek.getkey("pesel"));
                if (znobyw == null) {
                    widok.WyswietlKomunikat("Nie znaleziono obywatela o podanym peselu.");
                    return false;
                }
                widok.WyswietlObywatela(znobyw);
            }
            default -> {
                if (model.DodajWniosekDoKolejki(wniosek)) {
                    widok.WyswietlKomunikat("Poprawnie dodano do kolejki wnioskow");
                } else {
                    widok.WyswietlKomunikat("Błąd przy dodawaniu do kolejki");
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Prezenter p = new Prezenter(new WidokObywatela(), new Model());
        while (p.zyc) {
            if (!p.WykonajWniosekObywatela()) {
                break;
            }
        }
    }
}
