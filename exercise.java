public class exercise {
    public static void main(String[] args) {
        // Step 4
        String creator = "Your Name";

        // Step 2
        System.out.println("Printer App");

        // Step 3
        System.out.println("This app is made by:");

        // Step 5
        System.out.print("This app is made by: ");
        System.out.println(creator);

        // Step 6
        int number1 = 5;
        int number2 = 2;

        // Step 7
        // System.out.println(number1);

        // Step 8
        System.out.println("The value of number1 is " + number1);

        // Step 9
        System.out.println("The value of number2 is " + number2);

        // Step 10
        int multiplication = number1 * number2;

        // Step 12
        System.out.println(number1 + " * " + number2 + " = " + multiplication);

        // Repeat 10-12 for addition, division, and subtraction
        int addition = number1 + number2;
        System.out.println(number1 + " + " + number2 + " = " + addition);

        double divisionResult = (double) number1 / number2;
        System.out.println(number1 + " / " + number2 + " = " + divisionResult);

        int subtraction = number1 - number2;
        System.out.println(number1 + " - " + number2 + " = " + subtraction);
    }
}

