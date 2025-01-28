package main.Model;

import fit.ColumnFixture;

public class FabrykaObywateliFixture extends ColumnFixture {
    public String pesel; // zmienna odpowiadająca za PESEL w testach
    public String imie;
    public String nazwisko;

    // metoda testująca wyszukiwanie obywatela po PESEL
    public String znajdzObywatela() {
        FabrykaObywateli fabrykaObywateli = new FabrykaObywateli();
        Obywatel obywatel = fabrykaObywateli.ZnajdzObywatela(pesel);
        if (obywatel != null) {
            return obywatel.getImie() + " " + obywatel.getNazwisko();
        }
        return "Nie znaleziono";
    }
}
