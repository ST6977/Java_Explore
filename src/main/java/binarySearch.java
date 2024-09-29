import java.util.Scanner;
import java.util.Arrays;
public class binarySearch {
    public static void main(String[]args){
        double[] cgpaArray = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};
        Arrays.sort(cgpaArray);

        //For User Input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an Input:");
        String input = scanner.nextLine();
        binarySearch(cgpaArray, Double.parseDouble(input));

    }



    //Using Binary Searching for checking ,this user input is present or not!!
    public static boolean binarySearch(double[] arr, double target){
      int left = 0;
      int right = arr.length - 1;
        boolean found = false;
      while (left <= right){
          int mid = left + (right - left) / 2;
          if(arr[mid] == target){
              found = true;
              break;
          }
          else if (arr[mid] < target) {
              left = mid + 1;
          } else {
              right = mid - 1;
          }





      }
        //checking if user input is found or not!
        if (found == true) {

            System.out.println("Found");
        } else {
            System.out.println("Not Found");

        }
        return found;
    }



}
