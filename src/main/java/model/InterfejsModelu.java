package main.Model;

import main.Prezenter.*;
import main.Prezenter.Wniosek;

public interface InterfejsModelu {
//	boolean WykonajWniosek(Wniosek w);
	Obywatel ZnajdzObywatela(String pesel);
	boolean DodajWniosekDoKolejki(Wniosek w);
	boolean WykonajPierwszyWniosekWKolejce();
}