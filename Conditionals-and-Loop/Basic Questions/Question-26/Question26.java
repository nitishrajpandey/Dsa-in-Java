import java.util.Scanner;

public class Question26 {
    public static void main(String[] args) {
        System.out.println("**** Adition of two number ***");
        Scanner inputData = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        float number1 = inputData.nextFloat();
        System.out.println("Enter the second number : ");
        float number2 = inputData.nextFloat();
        float sum = number2+number1;
        System.out.println("The sum of these two number is : " + sum );
    }
}
