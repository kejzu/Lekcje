public class Main {
    public static void main(String[] args) {
        Samochod car = new Samochod("Fiat","Punto",4,150,8.5);
        Samochod car2 = new Samochod("Volkswagen", "Passat",4,150, 8.9);

        Garaz garaz = new Garaz("Dąbrowskiego 33", 3);

        garaz.wprowadzSamochod(car);
        garaz.wprowadzSamochod(car2);

        garaz.wypiszInfo();

        garaz.wyprowadzSamochod();

        garaz.wypiszInfo();
    }
}
