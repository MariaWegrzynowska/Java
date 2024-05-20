import java.util.Arrays;
import java.util.Collections;

public class Playlista {
	String nazwa;
	Utwor[] lista_utworow;
	int ile_utworow;
	
	public Playlista(String n) {
		nazwa = n;
		lista_utworow = new Utwor[10];
		ile_utworow = 0;
		}
	
	public void dodajUtwor(Utwor u) {
		if (u == null ) {
			System.err.println(nazwa + ": Nie można dodac nieistniejącego utworu");
		   return;
		}
		if (ile_utworow >= lista_utworow.length) {
			System.err.println(nazwa + " niemożna dodać więcej utworów");
			return;
		}
		lista_utworow[ile_utworow++] = u;
	}
		
		public Utwor pobierzUtwor(int indeks_utworu) {
			if (indeks_utworu < 0 || indeks_utworu > ile_utworow ) {
				System.err.println(nazwa + ": Nie ma takiego utworu");
				return null;
			}
			return lista_utworow[indeks_utworu -1];
		}
		
		public void wyswietlUtwory() {
			if (ile_utworow == 0) {
				System.out.println(nazwa + ": Brak utworu na liscie" );
						return;
			}
			System.out.println(nazwa + "-lista utworów: ");
			for (int i = 0; i < ile_utworow; i++) {
				System.out.println(i+1 + ". " + lista_utworow[i].toString());
			}
		}
		
		public Utwor usunUtwor(int indeks_utworu) {
			if (indeks_utworu < 0 || indeks_utworu > ile_utworow) {
			System.err.println(nazwa + ": Nie ma takiego utworu na liscie");
			return null;
		}
		Utwor utwor = lista_utworow[indeks_utworu -1];
		lista_utworow[indeks_utworu -1] = null;
		ile_utworow--;
		
		for (int i = indeks_utworu -1; i< ile_utworow; i++) {
			lista_utworow[i] = lista_utworow[i+1];
		}
		return utwor;
		}
		
		public void posortujUtwory() {
			Arrays.sort(lista_utworow, 0, ile_utworow);
			//ollections.sort(lista_utworow);
		}
		
		
		
	}