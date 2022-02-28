public class Main {
    public static void main(String[] args) {
        Samochod car = new Samochod("Fiat","Punto",4,150,8.5);
        System.out.println("Koszt jazdy 100km przy cenie 5zl za litr: "+ car.ObliczKosztPrzejazdu(100,5));

        car.WypiszInfo();
        car.wypisziloscSamochodow();
    }
}
