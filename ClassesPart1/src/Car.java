public class Car {
    private String make = "Tesla";
    private String model = "Model X";
    private String color = "Gray";
    private int doors = 2;
    private boolean convertible = true;

    public Car() {
        this("ferrari", "3", "gray", 4, true);
        System.out.println("Empty constructor called");
    }

    public Car(String make, String model, String color, int doors, boolean convertible) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.doors = doors;
        this.convertible = convertible;
    }


    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void describeCar(){
        System.out.println(this.doors + " " + this.color + " " + this.make + " " + this.model + " " + this.convertible);
    }
}
