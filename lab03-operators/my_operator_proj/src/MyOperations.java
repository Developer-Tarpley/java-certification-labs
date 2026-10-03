public class MyOperations {

    public static void main(String[] args) {

        int[] myArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        int addition = myArray[0] + myArray[1];
        int subtraction = myArray[2] - myArray[3];
        int multiplication = myArray[4] * myArray[5];
        float division = myArray[6] / myArray[7];
        int modulus = myArray[8] % myArray[9];

        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + division);
        System.out.println("Modulus: " + modulus);

        int[] myArray2 = { 1, 22, 12, 54, 89, 7, 7, 0, 84, 44 };
        for (int i = 0; i < myArray2.length - 1; i++) {
            if (myArray2[i + 1] > myArray2[i]) {
                System.out.println(myArray2[i + 1] + " is greater than " + myArray2[i]);
            } else if (myArray2[i + 1] < myArray2[i]) {
                System.out.println(myArray2[i + 1] + " is less than " + myArray2[i]);
            } else {
                System.out.println(myArray2[i + 1] + " is equal to " + myArray2[i]);
            }
        }

        System.out.println("Ternary: ");

        int[] myArray3 = { 1, 2, 2, 54, 33, 65, 47, 24, 990, 14 };

        for (int i = 0; i < myArray3.length - 1; i++) {

            String output = myArray3[i + 1] < myArray3[i] ? " is less than "
                    : myArray3[i + 1] > myArray3[i] ? " is greater than " : " is equal to ";

            System.out.println(myArray3[i + 1] + output + myArray3[i]);

        }
    }
}