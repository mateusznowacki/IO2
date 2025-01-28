package main.Widok;


import main.Model.Obywatel;
import main.Prezenter.Wniosek;

public interface InterfejsWidoku {
    void WyswietlFormularz(Wniosek w);
    void WyswietlObywatela(Obywatel obywatel);
    void WyswietlKomunikat(String komunikat);
    String PobierzDaneZKonsoli(String pytanie);
}
