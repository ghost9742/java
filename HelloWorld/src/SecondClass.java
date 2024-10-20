public class SecondClass {
    public static void main(String[] args){
        System.out.println("Second Class");

        boolean isAlien = false;
        if (!isAlien && 5 < 10) {
            System.out.println("it is not an alien");
            System.out.println("test");
        }
        int topScore = 100;
        if (topScore == 100) {
            System.out.println("You got the high score!");
        }

        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;
        System.out.println(isDomestic);
    }
}
