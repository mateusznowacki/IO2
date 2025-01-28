package model;


import prezenter.Wniosek;

public interface InterfejsModelu {
//	boolean WykonajWniosek(Wniosek w);
	Obywatel ZnajdzObywatela(String pesel);
	boolean DodajWniosekDoKolejki(Wniosek w);
	boolean WykonajPierwszyWniosekWKolejce();
}