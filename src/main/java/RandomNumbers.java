import java.util.Random;

public class RandomNumbers {
    public static void main(String[]args){
        int [] numbers = new int[10];
        Random random = new Random();

        //for loop
        for(int i = 0; i< numbers.length; i++){
            numbers[i] = random.nextInt(30);

        }

        //print all the numbers
        System.out.println("Generated numbers:");
        for(int number : numbers){
            System.out.print(number + " ");
        }
        System.out.println();


        int max = numbers[0];
        int min = numbers[0];

        for (int number : numbers) {
            if (number > max) {
                max = number; // Update max if current number is greater
            }
            if (number < min) {
                min = number; // Update min if current number is smaller
            }
        }


        // Print max and min numbers
        System.out.println("Maximum number: " + max);
        System.out.println("Minimum number: " + min);
    }


}
