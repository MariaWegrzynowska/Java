
public class PiramidaPionowa {

	public static void main(String[] args) {
	
	int n = Integer.parseInt(args[0]);	
	int kolumny = 2*n-1;

	for (int i = 0; i<n; i++) {
		int liczbaX = (i*2+1);
		String wiersz = "";
		
		for (int m=0; m<((kolumny-liczbaX)/2); m++) {
			wiersz += " ";	
		} 
		
		for (int m=0;  m<liczbaX; m++) {
			wiersz += "x";
		}
		
		for (int m=0; m<((kolumny-liczbaX)/2); m++) {
			wiersz += " ";	
		} 
	System.out.println(wiersz);	
	}
	
	}

}
