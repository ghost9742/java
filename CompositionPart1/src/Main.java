public class Main {
    public static void main(String[] args) {

        ComputerCase theCase = new ComputerCase("2208", "Dell", "600");
        Monitor theMonitor = new Monitor("27inch", "Acer", 27, "1920 x 1080");
        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        PersonalComputer thePC = new PersonalComputer("2028", "Dell", theCase, theMonitor, theMotherboard);

//        thePC.getMonitor().drawPixelAt(10, 10, "red");
//        thePC.getMotherboard().loadProgram("Windows OS");
//        thePC.getComputerCase().pressPowerButton();

        thePC.powerUp();
    }
}
