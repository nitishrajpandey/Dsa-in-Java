import java.util.Scanner;

public class Question22 {
    public static void main(String[] args) {
        System.out.println("*** Subtract the product and sum of Digits of an integer *****");
        Scanner inputData = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        float number1 = inputData.nextFloat();
        System.out.println("Enter the second number : ");
        float number2 = inputData.nextFloat();
        float product = number1*number2;
        System.out.println("the product is : " + product);
        float sum = number1+number2;
        System.out.println("The sum is : " + sum);
        float subtract = product-sum;
        System.out.println("the result is " + subtract);
    }
}
