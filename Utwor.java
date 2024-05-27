public class Utwor implements Comparable<Utwor> {
    private String tytul;
    private String wykonawca;
    private int rokWydania;

    public Utwor(String t, String w, int rokWyd) {
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

    @Override
    public String toString() {
        return getTytul() + " (" + getWykonawca() + ") [" + getRokWydania() + "]";
    }

    @Override
    public int compareTo(Utwor u) {
        return this.getTytul().compareTo(u.getTytul());
    }
}
