
public class RokPrzestępny {
	public static void main(String[] args) {
		
		int rok = 2024;
		
		if (rok%400==0) {
			System.out.println("Rok rok JEST rokiem przestępnym");
		} else if (rok%4!=0) {
			System.out.println("Rok rok NIE JEST rokiem przestępnym");
		} else if (rok%100==0) {
			System.out.println("Rok rok NIE JEST rokiem przestępnym");
		} else {
			System.out.println("Rok rok JEST rokiem przestępnym");
		}

	}
}
