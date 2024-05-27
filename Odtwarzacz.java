import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Odtwarzacz {
    private Map<String, Playlista> playlisty;

    public Odtwarzacz() {
        playlisty = new HashMap<>();
        Playlista rock = new Playlista("Rock");
        rock.dodajUtwor(new Utwor("Smok", "Band1", 2000));
        rock.dodajUtwor(new Utwor("Dragon", "Band2", 2001));
        rock.dodajUtwor(new Utwor("Wiezienie", "Band3", 2001));
        rock.dodajUtwor(new Utwor("Tatuaż", "Band4", 2001));
        rock.dodajUtwor(new Utwor("Ojciec", "Band5", 2001));

        Playlista pop = new Playlista("Pop");
        pop.dodajUtwor(new Utwor("Justice beaver", "Artist1", 2010));
        pop.dodajUtwor(new Utwor("Cool kids", "Artist2", 2011));
        pop.dodajUtwor(new Utwor("Not cool kids", "Artist3", 2011));
        pop.dodajUtwor(new Utwor("Tall kids", "Artist4", 2011));
        pop.dodajUtwor(new Utwor("Kids", "Artist5", 2011));

        playlisty.put(rock.nazwa, rock);
        playlisty.put(pop.nazwa, pop);
    }

    public void wlacz() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Wyświetl playlisty");
            System.out.println("2. Dodaj nową playlistę");
            System.out.println("3. Wyświetl zawartość playlisty");
            System.out.println("4. Posortuj utwory w playliście");
            System.out.println("5. Usuń playlistę");
            System.out.println("6. Dodaj utwór do playlisty");
            System.out.println("7. Przenieś utwór między playlistami");
            System.out.println("8. Skopiuj utwór między playlistami");
            System.out.println("9. Skasuj utwór z playlisty");
            System.out.println("10. Zakończ");

            int wybor = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (wybor) {
                case 1:
                    wyswietlPlaylisty();
                    break;
                case 2:
                    dodajPlayliste(scanner);
                    break;
                case 3:
                    wyswietlZawartoscPlaylisty(scanner);
                    break;
                case 4:
                    posortujPlayliste(scanner);
                    break;
                case 5:
                    usunPlayliste(scanner);
                    break;
                case 6:
                    dodajUtworDoPlaylisty(scanner);
                    break;
                case 7:
                    przeniesUtworMiedzyPlaylistami(scanner);
                    break;
                case 8:
                    skopiujUtworMiedzyPlaylistami(scanner);
                    break;
                case 9:
                    skasujUtworZPlaylisty(scanner);
                    break;
                case 10:
                    System.out.println("Koniec programu.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Nieprawidłowa opcja.");
            }
        }
    }

    private void wyswietlPlaylisty() {
        System.out.println("Playlisty:");
        for (String nazwa : playlisty.keySet()) {
            System.out.println("- " + nazwa);
        }
    }

    private void dodajPlayliste(Scanner scanner) {
        System.out.print("Podaj nazwę nowej playlisty: ");
        String nazwa = scanner.nextLine();
        playlisty.put(nazwa, new Playlista(nazwa));
        System.out.println("Playlista " + nazwa + " dodana.");
    }

    private void wyswietlZawartoscPlaylisty(Scanner scanner) {
        System.out.print("Podaj nazwę playlisty: ");
        String nazwa = scanner.nextLine();
        Playlista playlista = playlisty.get(nazwa);
        if (playlista != null) {
            playlista.wyswietlUtwory();
        } else {
            System.out.println("Brak playlisty o nazwie " + nazwa);
        }
    }

    private void posortujPlayliste(Scanner scanner) {
        System.out.print("Podaj nazwę playlisty: ");
        String nazwa = scanner.nextLine();
        Playlista playlista = playlisty.get(nazwa);
        if (playlista != null) {
            playlista.posortujUtwory();
            System.out.println("Playlista " + nazwa + " została posortowana.");
        } else {
            System.out.println("Brak playlisty o nazwie " + nazwa);
        }
    }

    private void usunPlayliste(Scanner scanner) {
        System.out.print("Podaj nazwę playlisty do usunięcia: ");
        String nazwa = scanner.nextLine();
        if (playlisty.remove(nazwa) != null) {
            System.out.println("Playlista " + nazwa + " została usunięta.");
        } else {
            System.out.println("Brak playlisty o nazwie " + nazwa);
        }
    }

    private void dodajUtworDoPlaylisty(Scanner scanner) {
        System.out.print("Podaj nazwę playlisty: ");
        String nazwa = scanner.nextLine();
        Playlista playlista = playlisty.get(nazwa);
        if (playlista != null) {
            System.out.print("Podaj tytuł utworu: ");
            String tytul = scanner.nextLine();
            System.out.print("Podaj wykonawcę: ");
            String wykonawca = scanner.nextLine();
            System.out.print("Podaj rok wydania: ");
            int rokWydania = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            playlista.dodajUtwor(new Utwor(tytul, wykonawca, rokWydania));
            System.out.println("Utwór został dodany do playlisty " + nazwa);
        } else {
            System.out.println("Brak playlisty o nazwie " + nazwa);
        }
    }

    private void przeniesUtworMiedzyPlaylistami(Scanner scanner) {
        System.out.print("Podaj nazwę playlisty źródłowej: ");
        String nazwaZrodlo = scanner.nextLine();
        Playlista playlistaZrodlo = playlisty.get(nazwaZrodlo);
        if (playlistaZrodlo != null) {
            System.out.print("Podaj indeks utworu do przeniesienia: ");
            int indeks = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            Utwor utwor = playlistaZrodlo.usunUtwor(indeks);
            if (utwor != null) {
                System.out.print("Podaj nazwę playlisty docelowej: ");
                String nazwaCel = scanner.nextLine();
                Playlista playlistaCel = playlisty.get(nazwaCel);
                if (playlistaCel != null) {
                    playlistaCel.dodajUtwor(utwor);
                    System.out.println("Utwór został przeniesiony z " + nazwaZrodlo + " do " + nazwaCel);
                } else {
                    System.out.println("Brak playlisty o nazwie " + nazwaCel);
                }
            }
        } else {
            System.out.println("Brak playlisty o nazwie " + nazwaZrodlo);
        }
    }

    private void skopiujUtworMiedzyPlaylistami(Scanner scanner) {
        System.out.print("Podaj nazwę playlisty źródłowej: ");
        String nazwaZrodlo = scanner.nextLine();
        Playlista playlistaZrodlo = playlisty.get(nazwaZrodlo);
        if (playlistaZrodlo != null) {
            System.out.print("Podaj indeks utworu do skopiowania: ");
            int indeks = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            Utwor utwor = playlistaZrodlo.pobierzUtwor(indeks);
            if (utwor != null) {
                System.out.print("Podaj nazwę playlisty docelowej: ");
                String nazwaCel = scanner.nextLine();
                Playlista playlistaCel = playlisty.get(nazwaCel);
                if (playlistaCel != null) {
                    playlistaCel.dodajUtwor(new Utwor(utwor.getTytul(), utwor.getWykonawca(), utwor.getRokWydania()));
                    System.out.println("Utwór został skopiowany z " + nazwaZrodlo + " do " + nazwaCel);
                } else {
                    System.out.println("Brak playlisty o nazwie " + nazwaCel);
                }
            }
        } else {
            System.out.println("Brak playlisty o nazwie " + nazwaZrodlo);
        }
    }

    private void skasujUtworZPlaylisty(Scanner scanner) {
        System.out.print("Podaj nazwę playlisty: ");
        String nazwa = scanner.nextLine();
        Playlista playlista = playlisty.get(nazwa);
        if (playlista != null) {
            System.out.print("Podaj indeks utworu do skasowania: ");
            int indeks = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            if (playlista.usunUtwor(indeks) != null) {
                System.out.println("Utwór został skasowany z playlisty " + nazwa);
            } else {
                System.out.println("Brak utworu o podanym indeksie.");
            }
        } else {
            System.out.println("Brak playlisty o nazwie " + nazwa);
        }
    }

    public static void main(String[] args) {
        Odtwarzacz odtwarzacz = new Odtwarzacz();
        odtwarzacz.wlacz();
    }
}
