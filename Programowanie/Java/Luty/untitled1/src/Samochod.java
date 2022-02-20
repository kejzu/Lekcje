public class Samochod implements Moveable{
    private int predkosc =100;

    @Override
    public void start() {
        System.out.println("Samochód rusza");
    }

    @Override
    public void stop() {
        System.out.println("Samochód zatrzymał się");
    }

    public int getPredkosc(){
        return predkosc;
    }

}
