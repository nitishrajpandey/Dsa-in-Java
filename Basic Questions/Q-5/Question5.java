import java.util.Scanner;

public class Question5 {
    public static void main(String[] args){
        System.out.println("**** Find largest number **** ");
        Scanner inputData = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        float number1= inputData.nextFloat();
        System.out.println("Enter the Second number : ");
        float number2 = inputData.nextFloat();
        if (number1>number2) {
            System.out.println("The largest number is : "+number1);
        } else if (number1<number2) {
            System.out.println("The largest number is : "+number2);
        }
        else{
            System.out.println(number1 + " and " + number2+ "Both are equal");        }
    }
}
