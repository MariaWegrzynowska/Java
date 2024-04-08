
import java.util.Scanner;

public class zadanie01 {
	
	//zadanie 1
	private static int[] utworzTablice(int n, Scanner sc) {
		int[] lista = new int[n];
		System.out.println("Podaj liczby: ");
	
		for (int i = 0; i < n; i++) {
			int b = sc.nextInt();
			lista[i] = b;
		} 
		
		for (int j = 0; j<n; j++) {
			System.out.println(lista[j]);
		}
		
		return lista;
	}
	
	// Zadanie 2
	private static int suma(int[] lista) {
		int n = lista.length;
		int suma = 0;
			
		for (int j = 0; j<n; j++) {
			suma += lista[j];
		}
		
		return suma;
	}
	
	private static void liczbaPar (int[] lista, int k) {
		int n=0;
		for (int i=0; i<lista.length; i++) {
			for (int j=j+1, j<lista.legth; j++) {
			if ((lista[i]+lista[j])%k==0); {
				n++;
			}
		}
	

	return n;
	}
	
	//zadanie 1
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ile elementów ma mieć twoja lista");
		int n = sc.nextInt();
		
		int[] lista = utworzTablice(n, sc);	
		
		int wynik = suma(lista);
		System.out.println(wynik);
				
	}
}
