public class ZarzadzaniePlaylistami {
    public static void main(String[] args) {
        Playlista rock = new Playlista("Rock");
        Playlista pop = new Playlista("Pop");

        rock.dodajUtwor(new Utwor("Smoke on the Water", "Deep Purple", 1972));
        rock.dodajUtwor(new Utwor("Child in Time", "Deep Purple", 1970));
        rock.dodajUtwor(new Utwor("Fortunate Son", "CCR", 1969));
        rock.dodajUtwor(new Utwor("Have You Ever Seen The Rain?", "CCR", 1970));
        rock.dodajUtwor(new Utwor("Fear of the Dark", "Iron Maiden", 1992));
        rock.dodajUtwor(new Utwor("Aces High", "Iron Maiden", 1984));
        rock.dodajUtwor(new Utwor("The Trooper", "Iron Maiden", 1983));

        pop.dodajUtwor(new Utwor("Tylko z Tobą Chcę Być Sobą", "Łukasz Zagrobelny", 2014));
        pop.dodajUtwor(new Utwor("Love Me Like You Do", "Ellie Goulding", 2014));
        pop.dodajUtwor(new Utwor("Jutro", "LemON", 2014));
        pop.dodajUtwor(new Utwor("Cool Kids", "Echosmith", 2013));
        pop.dodajUtwor(new Utwor("Perdoname (feat. Adrian Delgado & DyCy)", "Deorro", 2014));
        pop.dodajUtwor(new Utwor("What are you waiting for", "Nickelback", 2014));
        pop.dodajUtwor(new Utwor("Lips Are Movin'", "Meghan Trainor", 2015));
        pop.dodajUtwor(new Utwor("Kalejdoskop szczęścia", "Andrzej Piaseczny", 2015));

        rock.wyswietlUtwory();
        System.out.println("");
        pop.wyswietlUtwory();
        System.out.println("");

        rock.posortujUtwory();
        pop.posortujUtwory();

        rock.wyswietlUtwory();
        System.out.println("");
        pop.wyswietlUtwory();
        System.out.println("");

        rock.usunUtwor(2);
        rock.wyswietlUtwory();
        System.out.println("");

        rock.dodajUtwor(pop.pobierzUtwor(5));
        rock.posortujUtwory();
        rock.wyswietlUtwory();
    }
}