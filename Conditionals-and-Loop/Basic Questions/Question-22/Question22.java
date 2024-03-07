import java.util.Scanner;

public class Question22 {
    public static void main(String[] args) {
        System.out.println(" **** Subtract the Product and Sum of Digits of an Integer *****");
        Scanner inputData = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = inputData.nextInt();
        int product = 1;
        int sum = 0;

        for (int i = number; i>0 ; i/=10) {
            int digit = i%10;
            product=product*digit;
            sum= sum+digit;
        }
        System.out.println("The product is : " + product);
        System.out.println("The sum is  : " + sum);
        int subtract = product-sum;
        System.out.println("The result is : " + subtract);
    }
}
