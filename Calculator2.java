
public class Calculator2 {

	public static void main(String[] args) {
		
		/* Prosty kalkulator */
		int x = 10;
		int y = 20;
		int z = x + y;
		/* System.out.println("Suma zmiennych: " + z); */
		
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[2]);
		String operator = args[1];
		double c = 0;
		
		switch (operator) { 
		   case "+" : 
			   c = a + b;
			   System.out.println("Suma: " + c); 
		   		break; 
		   		
		   case "-" : 
			   c = a - b;
			   System.out.println("Różnica: " + c); 
		   		break; 
		   		
		   case "x" : 
			   c = a * b;
			   System.out.println("Iloczyn: " + c); 
		   		break; 
		   		
		   case "/" : 
			   c = a / b;
			   System.out.println("Iloraz: " + c); 
		   		break; 
				
	}}

}
