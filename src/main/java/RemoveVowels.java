import java.util.Scanner;

public class RemoveVowels {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        String result = input.replaceAll("[AEIOUaeiou]", "");
        System.out.println("String without vowels: " + result);
    }

}





