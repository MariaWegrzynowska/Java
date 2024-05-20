
public class Utwor  implements Comparable {

	private String tytul;
	private String wykonawca;
	private int rokWydania;
	
	public Utwor (String t, String w, int rokWyd) {
		tytul = t;
		wykonawca = w;
		rokWydania = rokWyd;
	}

	public String getTytul() {
		return tytul;
	}

	public String getWykonawca() {
		return wykonawca;
	}

	public int getRokWydania() {
		return rokWydania;
	}
	
	/*
	public String getTytul() {
		return tytul;
	}
	
	public String getWykonawca() {
		return wykonawca;
	}
	
	public int getRokWykonania() {
		return rokWydania;
	}
	
	Source --> genarate getters and setters --> select getters 
	
	*/
	
	public String toString() {
		return getTytul() + " (" + getWykonawca() + ") [" + getRokWydania() + "]";
		
	}

	@Override
	public int compareTo(Object o) {
		Utwor u = (Utwor) o;
		return this.getTytul().compareTo(u.getTytul());
	}
	
	// interface funckjyjny - to taki vco posiada jedną metode
	
	
	
	
	
}
