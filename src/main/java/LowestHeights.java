import java.util.Scanner;

public class LowestHeights {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfBabies = 10;

        // Taking input for heights
        System.out.println("Enter the heights of " + numberOfBabies + " babies in cm:");
        int[] heights = new int[numberOfBabies];

        for (int i = 0; i < numberOfBabies; i++) {
            heights[i] = scanner.nextInt();
        }

        // Initialize the two lowest heights
        int lowest = heights[0];
        int secondLowest = heights[0];

        // Find the two lowest heights
        for (int height : heights) {
            if (height < lowest) {
                secondLowest = lowest; // Update second lowest
                lowest = height; // Update lowest
            } else if (height < secondLowest && height != lowest) {
                secondLowest = height; // Update second lowest
            }
        }

        // Output the results
        System.out.println("The lowest height is: " + lowest + " cm");
        System.out.println("The second lowest height is: " + secondLowest + " cm");

        scanner.close();
    }
}
