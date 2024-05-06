import java.util.List; // to jest interface
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TestListy {
	// interface - zbiór nagłówków - sposób komunikacji
	
	public static void main(String[] args) {
		List<String> slowa;
		
		// generyczny - ogólny, podstawowy
		
		slowa = new ArrayList<>();
		slowa.add("jeden");
		slowa.add("dwa");
		slowa.add("trzy");
		System.out.println(slowa);
		
		slowa.add(1, "nowy");
		System.out.println(slowa);
		
		//slowa.add(5, "problem");
		//indeks nie może być większy niż dlugość listy
		slowa.add("problem");
				
		slowa.remove(2);
		//slowa.remove(4);
		// nie da się usunąć coś czego nie ma
		System.out.println(slowa);
		
		// Przypisanie tablicy słów
        String[] slowaWTablicy = {"Jeden", "Dwa", "Trzy", "Cztery"};

        // Wyświetlenie tablicy słów
        System.out.println(Arrays.toString(slowaWTablicy));

        // Dodanie wszystkich słów z tablicy do listy i wyświetlenie
        slowa.addAll(Arrays.asList(slowaWTablicy));
        System.out.println(slowa);

        // Dodanie słów z tablicy na początek listy i wyświetlenie
        slowa.addAll(0, Arrays.asList(slowaWTablicy));
        System.out.println(slowa);
        
        slowa.set(3, "pięć");
        System.out.println(slowa);
        
        Collections.sort(slowa);
        System.out.println(slowa);
        
		Collections.reverse(slowa);
		System.out.println(slowa);
				
		System.out.println(slowa.indexOf("Jeden"));
		
		Collections.shuffle(slowa);
		System.out.println(slowa);
		
		Collections.replaceAll(slowa, "Dwa", "2");
		System.out.println(slowa);
		
		slowa.clear();
		System.out.println(slowa);
		
		}	}
