import java.util.Scanner;

public class Question21 {
    public static void main(String[] args) {
        System.out.println(" ***** Find Fibonacci series of nth number ****");
        Scanner inputData = new Scanner(System.in);
        System.out.println("Enter the nth number : ");
        int number = inputData.nextInt();
        int firstNumber = 0;
        int secondNumber = 1;
        int count =1;

         while (count<=number ){
             System.out.println(firstNumber);
            int temp = firstNumber+secondNumber;
            secondNumber=firstNumber;
            firstNumber=temp;
            count++;
         }

    }
}
