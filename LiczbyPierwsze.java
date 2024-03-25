
public class LiczbyPierwsze {

	public static void main(String[] args) {
		int x = Integer.parseInt(args[0]);
		boolean result = true;
		for (int i = 2; i<= Math.sqrt(x); i++) {
			if (x%i==0) {
				result=false;
				break;
			}
			
		} if (result==true){
			System.out.println("Liczba" + x + " jest liczbą pierwszą" );
		} else {
			System.out.println("Liczba" + x + " nie jest liczbą pierwszą");
		}				
			}
	}

