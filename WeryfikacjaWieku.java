
public class WeryfikacjaWieku {

	public static void main(String[] args) {
		int wiek = 20;
		if (wiek<0) {
			System.out.println("Podany wiek nie może być ujemny !");
		}
		if (wiek >= 18 ) {
			System.out.println( "Program jest przeznaczony wyłącznie dla dzieci!"); 
		} else {
			System.out.println("Witaj w programie dla dzieci!"); 
		}
	}

}
