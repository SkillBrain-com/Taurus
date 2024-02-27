package AdinaPecie.JavaBasic3;

public class NumberToArray {

        public static int[] numberToArray(int number) {
            // Count the number of digits in the number
            int numDigits = (int) Math.log10(number) + 1;

            // Create an array to store the digits
            int[] array = new int[numDigits];

            // Extract digits from the number and store them in the array
            for (int i = numDigits - 1; i >= 0; i--) {
                array[i] = number % 10; // Extract the last digit
                number /= 10; // Remove the last digit
            }

            return array;
        }

        public static void main(String[] args) {
            int number = 12345;
            int[] array = numberToArray(number);

            System.out.println("Array representation of the number " + number + ":");
            for (int digit : array) {
                System.out.print(digit + " ");
            }


            }
        }


