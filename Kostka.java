import java.util.Random;

class Kostka {
    int liczbaScian;

    public Kostka(int liczbaScian) {
        this.liczbaScian = liczbaScian;
    }

    public int rzu�() {
        Random random = new Random();
        return random.nextInt(liczbaScian) + 1;
    }
}