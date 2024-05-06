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

    public void dodajKostk�(Kostka kostka) {
        kostki.add(kostka);
    }

    public void rozegrajRund�() {
        for (Gracz gracz : gracze) {
            for (Kostka kostka : kostki) {
                int wynik = kostka.rzu�();
                gracz.dodajWynik(wynik);
                System.out.println(gracz.getNazwa() + " rzuci� kostk� o " + kostka.liczbaScian + " �cianach i uzyska� wynik: " + wynik);
            }
        }
    }

    public void wy�wietlWyniki() {
        for (Gracz gracz : gracze) {
            System.out.println("Wynik gracza " + gracz.getNazwa() + ": " + gracz.sumaWynik�w());
        }
    }
}
 