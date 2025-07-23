public class JavaBasic_02 {

//     2. Accept five integers in an array -
// a. Find maximum and minimum of the integers. Do not sort the array.
// b. Multiply each element of the array by 5 and store it in another array and display it

    public static void main(String[] args) {
        int[] numbers = {12, 5, 23, 9, 17};  
        int max = numbers[0];
        int min = numbers[0];

        // Find max and min using a regular for loop
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        // Multiply each element by 5 and store in another array
        int[] multiplied = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            multiplied[i] = numbers[i] * 5;
        }

        // Print original array
        System.out.print("Original Array: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        // Print max and min
        System.out.println("\nMaximum: " + max);
        System.out.println("Minimum: " + min);

        // Print multiplied array
        System.out.print("Multiplied by 5: ");
        for (int i = 0; i < multiplied.length; i++) {
            System.out.print(multiplied[i] + " ");
        }
    }
}
