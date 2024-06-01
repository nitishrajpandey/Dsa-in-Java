import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int num1 = userInput.nextInt();
        System.out.print("Enter the second number : ");
        int num2 = userInput.nextInt();
        System.out.println("The total sum of "+num1+" and "+num2+" is : "+(num1+num2));
    }
}