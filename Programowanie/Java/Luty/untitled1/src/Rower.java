public class Rower implements Moveable{
    private int predkosc =20;

    @Override
    public void start() {
        System.out.println("Rower rusza");
    }

    @Override
    public void stop() {
        System.out.println("Rower zatrzymał się");
    }

    public int getPredkosc(){
        return predkosc;
    }0
}
