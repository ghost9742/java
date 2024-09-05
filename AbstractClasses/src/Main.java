public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog("Yorkie");
        dog.breathe();
        dog.eat();

        Parrot parrot = new Parrot("Parrot");
        parrot.eat();
        parrot.breathe();
        parrot.fly();

        Pengiun pengiun = new Pengiun("Emperor");
        pengiun.fly();
    }
}
