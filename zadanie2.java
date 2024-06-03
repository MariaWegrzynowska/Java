import java.util.Scanner;
import java.util.ArrayList;

public class zadanie2 {

	public static void main(String[] args) {
		System.out.println("Witaj w programie do robienia listy zadań");
		Scanner scanner = new Scanner (System.in);
		System.out.println("Podaj nazwe listy: ");
		String nazwa = scanner.nextLine();
		System.out.println("Nazwa twojej listy: " + nazwa);
		ArrayList<String>  lista = new ArrayList<>();
		
		System.out.println("Wybierz co chcesz zrobić ze swoją listą '" + nazwa + "': ");
		System.out.println("1 - dodać zadanie do listy");
		System.out.println("2 - usunąć zadanie z listy");
		System.out.println("3 - wyświetlić listę");
		System.out.println("4 - oznaczyć zadanie jako wykonane");
		System.out.println("5 - zmienić nazwe listy");
		System.out.println("6 - zakończyć działanie programu");
		
		byte wybor = scanner.nextByte();
		
		
		switch (wybor) {
		case 1: 
			dodaj();
			break;
			
		case 2:
			usun();
			break;
			
		case 3:
			
			break;
			
		case 4:
			
			break;	
			
		case 5:
			
			break;
		}
		
		
			
	}
	
	public static void dodaj() {
		System.out.println("Jakie zadanie chcesz dodać: ");
		String zadanie = scanner.nextLine();
		lista.add(zadanie);
	}
	
	public static void usun() {
		System.out.println("Jakie zadanie chcesz usunąć (podaj numer tego zadania): ");
		byte numer = scanner.nextByte();
		String zadanie = scanner.nextLine();
		lista.remove(numer + 1);
	}
}
