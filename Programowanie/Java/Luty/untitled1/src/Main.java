public class Main {
    public static void main(String[] args){
        Rower rower = new Rower();

        rower.start();
        rower.stop();
        System.out.println(rower.getPredkosc());

        Samochod samochod = new Samochod();

        samochod.start();
        samochod.stop();
        System.out.println(samochod.getPredkosc());
    }
}
