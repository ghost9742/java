public class Main {

    public static int multiplier = 7;

    public static void main(String[] args) {

        StaticTest firstInstance = new StaticTest("1st Instance");
        System.out.println(firstInstance.getName() + " is instance number" + StaticTest.getNumInstances());

        StaticTest secondInstance = new StaticTest("2st Instance");
        System.out.println(secondInstance.getName() + " is instance number" + StaticTest.getNumInstances());

        int answer = multiply(6);
        System.out.println("The answer is " + answer);
    }

    public static int multiply(int number) {
        return number * multiplier;
    }
}
