import java.util.Scanner;

public class zadanie01 {

		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Witaj w kalkulatorze BMI");
			
			System.out.println("Podaj mase ciała (w kg):");
			float waga = scanner.nextFloat();
			
			System.out.println("Podaj wzrost (w m):");
			float wzrost = scanner.nextFloat();
			
			float BMI = BMI(waga, wzrost);
			
			System.out.println("Twoje BMI: " + Interpretacja(BMI));
			
			scanner.close();
		}
		
		public static float BMI(float waga, float wzrost) {
			return waga/(wzrost*wzrost);
		}
		
		public static String Interpretacja(float BMI) {
			if (BMI < 18.5) {
				return "nieodwaga";
			} else if (BMI <25) {
				return "w normie";
			} else if (BMI < 30) {
				return "nadwaga";
			} else {
				return "otyłość";
			}
		}
}
