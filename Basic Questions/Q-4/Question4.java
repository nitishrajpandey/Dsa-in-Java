import java.util.Scanner;

public class Question4 {
    public static void main(String[] args){
        System.out.println("**** Calculator **** ");
        System.out.print("Enter the first number : ");
        Scanner inputData = new Scanner(System.in);
        float number1 = inputData.nextFloat();
        System.out.print("Enter the second number : ");
        float number2 = inputData.nextFloat();
        System.out.print("Enter the operator : ");
        char operator = inputData.next().charAt(0);

        float result=0;
        if (operator == '+' ){
            result=number1+number2;
        } else if (operator == '-') {
            result=number1-number2;
        } else if (operator=='*') {
            result=number1*number2;
        } else if (operator=='/') {
            if (number2!=0){
                result=number1/number2;
            }else {
                System.out.println("Error :  Division by zero");
        }
        } else if (operator=='%') {
            if (number2!=0){
                result=number1%number2;
            }else {
                System.out.println("Error :  Division by zero");
            }

        }
        else {
            System.out.println("Enter the correct Operator");
        }


        System.out.println("***** Result *****");
        System.out.println(number1 + " " + operator +" " + number2 +" = "+ result);
    }
}
