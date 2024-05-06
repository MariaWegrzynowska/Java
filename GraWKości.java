
import java.util.Scanner;

public class GraWKo�ci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Witaj w grze w ko�ci!");

        // Tworzenie gry
        Gra gra = new Gra();

        // Dodawanie graczy
        System.out.print("Podaj liczb� graczy: ");
        int liczbaGraczy = scanner.nextInt();
        scanner.nextLine(); // konsumowanie znaku nowej linii
        for (int i = 0; i < liczbaGraczy; i++) {
            System.out.print("Podaj nazw� gracza " + (i + 1) + ": ");
            String nazwaGracza = scanner.nextLine();
            gra.dodajGracza(new Gracz(nazwaGracza));
        }

        // Dodawanie kostek
        System.out.print("Podaj liczb� kostek: ");
        int liczbaKostek = scanner.nextInt();
        for (int i = 0; i < liczbaKostek; i++) {
            System.out.print("Podaj liczb� �cian kostki " + (i + 1) + ": ");
            int liczbaScian = scanner.nextInt();
            gra.dodajKostk�(new Kostka(liczbaScian));
        }

        // Rozgrywanie rundy
        System.out.print("Podaj liczb� rund do rozegrania: ");
        int liczbaRund = scanner.nextInt();
        for (int i = 0; i < liczbaRund; i++) {
            System.out.println("Runda " + (i + 1));
            gra.rozegrajRund�();
        }

        // Wy�wietlanie wynik�w
        System.out.println("Wyniki ko�cowe:");
        gra.wy�wietlWyniki();

        scanner.close();
    }
}
