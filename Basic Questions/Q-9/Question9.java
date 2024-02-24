import java.util.Scanner;

public class Question9 {
    public static void main (String[] args){
        System.out.println("***** Check Armstrong number *****");
        Scanner inputData = new Scanner(System.in);
        System.out.println("Enter the number to check : ");
        int value = inputData.nextInt();
        int origionalValue=value;
        String strValue=String.valueOf(value);
        int power=strValue.length();
        int total= 0;
        while (value>0){
            int digit = value%10;
            total += Math.pow(digit,power);
            value=value/10;
        }

        if (total ==origionalValue) {
            System.out.println("yes "+ origionalValue +"  is a armstrong number");
        }
        else {
            System.out.println("No "+ origionalValue +"  is not a armstrong number");
        }
    }
}