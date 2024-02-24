import java.util.Scanner;

public class Question1 {
    public static void main (String[] args) {
        System.out.print("Enter the number to find even or Odd : ");
        Scanner inputData = new Scanner(System.in);
        int number = inputData.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + " is Even number.");
        } else {
            System.out.println(number + " is Odd number.");
        }
    }
}

