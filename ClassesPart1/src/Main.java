public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setMake("Porsche");
        System.out.println("make = " + car.getMake());

        Car car2 = new Car("Porsche", "X", "white", 2, true);
        car2.describeCar();
    }
}
