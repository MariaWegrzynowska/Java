import java.util.ArrayList;
import java.util.List;


class Gra {
    private List<Gracz> gracze;
    private List<Kostka> kostki;

    public Gra() {
        this.gracze = new ArrayList<>();
        this.kostki = new ArrayList<>();
    }

    public void dodajGracza(Gracz gracz) {
        gracze.add(gracz);
    }

    public void dodajKostkê(Kostka kostka) {
        kostki.add(kostka);
    }

    public void rozegrajRundê() {
        for (Gracz gracz : gracze) {
            for (Kostka kostka : kostki) {
                int wynik = kostka.rzuæ();
                gracz.dodajWynik(wynik);
                System.out.println(gracz.getNazwa() + " rzuci³ kostk¹ o " + kostka.liczbaScian + " œcianach i uzyska³ wynik: " + wynik);
            }
        }
    }

    public void wyœwietlWyniki() {
        for (Gracz gracz : gracze) {
            System.out.println("Wynik gracza " + gracz.getNazwa() + ": " + gracz.sumaWyników());
        }
    }
}
 