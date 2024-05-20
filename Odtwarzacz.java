import java.util.Scanner;

public class Odtwarzacz {

	private Playlista p1;  //refractor --> rename --> i zmieniamy nazwe
	private Playlista p2;
	private Scanner sc;
	
	public Odtwarzacz() {
		p1  = new Playlista("Rock");
		p2  = new Playlista("Pop");
		
		sc = new Scanner(System.in);
		init();
		
	}
	
	private void init() {
		p1.dodajUtwor(new Utwor("Smoke on the Water", "Deep Purple", 1972));
		p1.dodajUtwor(new Utwor("Child in Time", "Deep Purple", 1970));
		p1.dodajUtwor(new Utwor("Fortunate Son", "CCR", 1969));
		p1.dodajUtwor(new Utwor("Have You Ever Seen The Rain?", "CCR", 1970));
		p1.dodajUtwor(new Utwor("Fear of the Dark", "Iron Maiden", 1992));
		p1.dodajUtwor(new Utwor("Aces High", "Iron Maiden", 1984));
		p1.dodajUtwor(new Utwor("The Trooper", "Iron Maiden", 1983));
		
		p2.dodajUtwor(new Utwor("Tylko z Tobą Chcę Być Sobą", "Łukasz Zagrobelny", 2014));
		p2.dodajUtwor(new Utwor("Love Me Like You Do", "Ellie Goulding", 2014));
		p2.dodajUtwor(new Utwor("Jutro", "LemON", 2014));
		p2.dodajUtwor(new Utwor("Cool Kids", "Echosmith", 2013));
		p2.dodajUtwor(new Utwor("Perdoname (feat. Adrian Delgado & DyCy)", "Deorro", 2014));
		p2.dodajUtwor(new Utwor("What are you waiting for", "Nickelback", 2014));
		p2.dodajUtwor(new Utwor("Lips Are Movin'", "Meghan Trainor", 2015));
		p2.dodajUtwor(new Utwor("Kalejdoskop szczęścia", "Andrzej Piaseczny", 2015));
	}
	
	public void wlacz() {
		Playlista p;
		
		while (true) {
			System.out.println("Co chcesz zrobić? Wybierz opcję: ");
			System.out.println("\t1:  wyświetlić playliste ");
			System.out.println("\t2:  dodać nowy utwór ");
			System.out.println("\t3:  przenieśc utwór ");
			System.out.println("\t4:  skopiować utwór ");
			System.out.println("\t5:  skasować utwór ");
			System.out.println("\t9:  wyłączyć odtwarzacz ");
			System.out.println("? ");
			
			byte o = sc.nextByte();
			sc.nextLine();
			
			switch(o) {
				case 1: 
					p = wybierzPlayliste(); 
					if (p != null) {
						p.wyswietlUtwory(); 
						}
						break;
					
				case 2:
					p = wybierzPlayliste(); 
					if (p!= null) {
						System.out.println("Podaj tytuł utworu: ");
						String tytul = sc.nextLine();
						System.out.println("Podaj wykonawce: ");
						String wykonawca = sc.nextLine();
						System.out.println("Rok: ");
						int rokWydania = sc.nextInt();
						
						p.dodajUtwor(new Utwor(tytul, wykonawca, rokWydania));
						p.wyswietlUtwory();
					}
					break;
					
				case 3:
					p = wybierzPlayliste(); 
					if (p!= null) {
						p.wyswietlUtwory();
						System.out.println("Który utwór: ");
						byte numerUtworu = sc.nextByte();
						
						Utwor u = p.usunUtwor(numerUtworu);
						if (u != null) {
							Playlista p_do = p.equals(p1)? p2 : p1;
							p_do.dodajUtwor(u);
						}
					}
					break;
					
				case 4:
					p = wybierzPlayliste(); 
					if (p!= null) {
						p.wyswietlUtwory();
						System.out.println("Który utwór: ");
						byte numerUtworu = sc.nextByte();
						
						Utwor u = p.pobierzUtwor(numerUtworu);
						if (u != null) {
							Playlista p_do = p.equals(p1)? p1 : p2;
							p_do.dodajUtwor(u);
						}
					}
					
					case 5:
						p = wybierzPlayliste(); 
						if (p!= null) {
							p.wyswietlUtwory();
							System.out.println("Który utwór ma zostać skasowany: ");
							byte numerUtworu = sc.nextByte();
							
							Utwor u = p.usunUtwor(numerUtworu);
						}
						break;
						
					case 9: 
						return;
					default:
						System.err.println("Nie rozpoznaje opcji");
			
		}
			
		}
		
		private Playlista wybierzPlayliste() {
			Playlista p = null;
			System.out.println("Której playlisty urzyć? ");
			
		}
					
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	

}
