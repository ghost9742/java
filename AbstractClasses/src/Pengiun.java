public class Pengiun extends Bird {

    public Pengiun(String name) {
        super(name);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("I am not very good at that");
    }
}
