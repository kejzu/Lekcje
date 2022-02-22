public class Main {
    public static void main(String[] args) {
        Plywa statek1 = new Statek();
        Lata samolot1 = new Samolot();

        statek1.plyn();
        samolot1.lec();

        Hydroplan hydroplan1 = new Hydroplan();

        hydroplan1.plyn();
        hydroplan1.lec();
    }
}
