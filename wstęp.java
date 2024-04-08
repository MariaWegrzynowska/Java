import java.util.Scanner;

public class wstęp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj dane wejściowe");
		
		String s = sc.next();
		System.out.print(s);
		
		int i = sc.nextInt();
		System.out.println(i);
		
		float f = sc.nextFloat();
		System.out.println(f);	

	}

}
