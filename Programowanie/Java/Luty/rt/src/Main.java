public class Main {
    public static void main(String[] args) {
        Car car = new Car("Ford","white","FG23482");
        Bike bike = new Bike("Gural","Fg421");

        Employee e = new Employee("Paweł", 234325, car, bike);

        System.out.println(e.name);
        System.out.println(e.id);
        System.out.println("_____________");
        System.out.println(e.car.name);
        System.out.println(e.car.color);
        System.out.println(e.car.reg);
        System.out.println("_____________");
        System.out.println(e.bike.name);
        System.out.println(e.bike.reg);
    }
}
