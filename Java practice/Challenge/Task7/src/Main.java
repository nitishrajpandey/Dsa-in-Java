import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Program to swap two number only using assigment operator ");
        System.out.print("Enter the first number : ");
        int number1 = userInput.nextInt();
        System.out.print("Enter the second number : ");
        int number2 = userInput.nextInt();
        System.out.println("You enter number 1 is "+number1 +" and number 2 is "+number2);
        int number3 = number1;
        number1=number2;
        number2=number3;
        System.out.println("After swap number 1 is "+number1 +" and number 2 is "+number2);
    }
}