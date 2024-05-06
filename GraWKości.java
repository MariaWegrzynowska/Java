
import java.util.Scanner;

public class GraWKoœci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Witaj w grze w koœci!");

        // Tworzenie gry
        Gra gra = new Gra();

        // Dodawanie graczy
        System.out.print("Podaj liczbê graczy: ");
        int liczbaGraczy = scanner.nextInt();
        scanner.nextLine(); // konsumowanie znaku nowej linii
        for (int i = 0; i < liczbaGraczy; i++) {
            System.out.print("Podaj nazwê gracza " + (i + 1) + ": ");
            String nazwaGracza = scanner.nextLine();
            gra.dodajGracza(new Gracz(nazwaGracza));
        }

        // Dodawanie kostek
        System.out.print("Podaj liczbê kostek: ");
        int liczbaKostek = scanner.nextInt();
        for (int i = 0; i < liczbaKostek; i++) {
            System.out.print("Podaj liczbê œcian kostki " + (i + 1) + ": ");
            int liczbaScian = scanner.nextInt();
            gra.dodajKostkê(new Kostka(liczbaScian));
        }

        // Rozgrywanie rundy
        System.out.print("Podaj liczbê rund do rozegrania: ");
        int liczbaRund = scanner.nextInt();
        for (int i = 0; i < liczbaRund; i++) {
            System.out.println("Runda " + (i + 1));
            gra.rozegrajRundê();
        }

        // Wyœwietlanie wyników
        System.out.println("Wyniki koñcowe:");
        gra.wyœwietlWyniki();

        scanner.close();
    }
}
