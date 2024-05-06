import java.util.ArrayList;
import java.util.List;

class Gracz {
    private String nazwa;
    private List<Integer> wyniki;

    public Gracz(String nazwa) {
        this.nazwa = nazwa;
        this.wyniki = new ArrayList<>();
    }

    public void dodajWynik(int wynik) {
        wyniki.add(wynik);
    }

    public int sumaWyników() {
        int suma = 0;
        for (int wynik : wyniki) {
            suma += wynik;
        }
        return suma;
    }

    public String getNazwa() {
        return nazwa;
    }
}
