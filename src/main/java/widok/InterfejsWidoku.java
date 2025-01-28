package widok;


import model.Obywatel;
import prezenter.Wniosek;

public interface InterfejsWidoku {
    void WyswietlFormularz(Wniosek w);
    void WyswietlObywatela(Obywatel obywatel);
    void WyswietlKomunikat(String komunikat);
    String PobierzDaneZKonsoli(String pytanie);
}
