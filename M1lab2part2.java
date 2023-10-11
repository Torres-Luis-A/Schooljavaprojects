import java.util.Random;

public class M1lab2part2{
    public static void main(String[] args) {
        int [][] twoArray = new int[2][5]; //  create the array and set the rows to 2 and colums to 5

        Random random = new Random();
        for (int i=0; i<2; i++) {
            for (int j = 0; j<5; j++){
                twoArray [i][j] = random.nextInt(100) + 1; // loads numbers into array between 1 and 100
            }
        }
             // Display the entire two-dimensional array
        System.out.println("The two-dimensional array:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(twoArray[i][j] + " ");
            }
            System.out.println(); // Move to the next row
        }
        
        //call methods
        int sum = calcsum(twoArray);
        System.out.println("The sum of all the numbers in the array = " + sum);

        int min = findmin(twoArray);
        System.out.println("The Smallest Number in the Array is "+ min);

        System.out.println("The odd numbers in the array are: ");
        findodd(twoArray);
    }

    //method to calculate sum
    public static int calcsum(int [][] array ){
        int sum = 0;
        for (int i=0;i<array.length;i++){
            for (int j =0; j<array[i].length; j++){
                sum += array [i][j];
            }
        }
        return sum;
    }
    //method to find smallest int
    public static int findmin (int [][] array){
        int min = array [0][0];
        for (int i=0; i<array.length; i++){
            for (int j = 0; j< array.length;j++){
                if (array[i][j]<min){
                    min = array [i][j];
                }
            }
        }
        return min;
        }
    //method to find odd numbers
    public static void findodd (int[][] array){
        for (int i=0;i<array.length;i++){
            for(int j=0;j<array.length;j++){
                if(array[i][j]%2 !=0){
                    System.out.println("Odd Number: "+ array [i][j]+" in position ("+i+","+j+")");
                }
            }
        }
    }
}
