
public class LiczbyParzyste {

	public static void main(String[] args) {
		int zakres = 34;
		int liczba = 0;
		
		do {
			if (liczba % 2 == 0) {
				System.out.println(liczba + " jest PARZYSTA");
			} else {
				System.out.println(liczba + " jest NIEPARZYSTA");
			}
			liczba += 1;
		} while (liczba <= zakres);
	}
}