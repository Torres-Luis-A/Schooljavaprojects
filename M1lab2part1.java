import java.util.Random;

public class M1lab2part1 {
        public static void main (String [] args){
            Random random = new Random(); //create instance of random

            int arraySize = 10; // set array size

            int[] randomNumbers = new int[arraySize];
            for (int i=0;i<arraySize; i++){
                randomNumbers[i] = random.nextInt(100); // add random numbers from 0 to 99
            }

            double average =calculateAverage(randomNumbers);
            System.out.println("Random numbers: ");
            for (int number : randomNumbers){
                System.out.println(number+ " ");
            }
            System.out.println("\nAvarage: "+average);

            int min = findMin(randomNumbers);
            int max = findMax(randomNumbers);
            System.out.println("Min: " + min);
            System.out.println("Max: " + max);
        }

        public static double calculateAverage(int[] numbers){
            if (numbers.length ==0){
                throw new IllegalArgumentException("Array is empty");
            }
            int sum = 0;
            for (int number:numbers) {
                sum += number;
            }
            return (double) sum / numbers.length;
        }

        public static int findMin(int[] numbers) {
            if (numbers.length ==0){
                throw new IllegalArgumentException("Array is empty");
            }
            int min = numbers[0];
            for (int number : numbers){
                if (number < min){
                    min = number;
                }
            }
            return min;
        }
        public static int findMax(int[] numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }

        int max = numbers[0];
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }

        return max;
    }
}
