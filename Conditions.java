
public class Conditions {

	public static void main(String[] args) {
		/*
		 if (true) { 
             System.out.println("TRUE condition"); 
         } else {
          	 System.out.println("FALSE condition"); 
          	 }
				
		 if (13 == 3) { 
             System.out.println("TRUE condition"); 
         } else {
          	 System.out.println("FALSE condition"); 
          	 }
		
		 if ('e' != 'E') { 
             System.out.println("TRUE condition"); 
         } else {
          	 System.out.println("FALSE condition"); 
          	 }
		
		 if ((2 + 2) == 4) { 
             System.out.println("TRUE condition"); 
         } else {
          	 System.out.println("FALSE condition"); 
          	 }
		
		 if ('z' >= 'a') { 
             System.out.println("TRUE condition"); 
         } else {
          	 System.out.println("FALSE condition"); 
          	 }
			
			*/
		
		/*
		int number = 5;
		
		 switch (number) { 
		   case 0 : System.out.println("In case of 0 => ZERO"); break; 
		   case 1 : System.out.println("In case of 1 => ONE"); 
		   case 2 : System.out.println("In case of 2 => TWO"); break; 
		   default : System.err.println("Unknown case: "+ number); 
		}
		*/
		
		/*
		int number = 1;
		
		 switch (number) { 
		   case 0 : System.out.println("In case of 0 => ZERO"); break; 
		   case 1 : System.out.println("In case of 1 => ONE"); 
		   case 2 : System.out.println("In case of 2 => TWO"); break; 
		   default : System.err.println("Unknown case: "+ number); 
		}
		
		 Wynik:
			 In case of 1 => ONE
			 In case of 2 => TWO

			Dlaczego? Bo nie ma break
		
		*/
		
		int number = 2;
		
		 switch (number) { 
		   case 0 : System.out.println("In case of 0 => ZERO"); break; 
		   case 1 : System.out.println("In case of 1 => ONE"); break;
		   case 2 : System.out.println("In case of 2 => TWO"); break; 
		   default : System.err.println("Unknown case: "+ number); 
		}
		
		 

	}

}
