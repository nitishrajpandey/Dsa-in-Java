import java.util.Scanner;

public class Question7 {
    public static void main(String[] args){
        System.out.println("***** Fibonacci series *****");
        Scanner inputData = new Scanner(System.in);
        System.out.println("Enter the nth number : ");
        int number = inputData.nextInt();
        int firstnum=0;
        int secondnum=1;
        for (int i = 1; i <=number; i++) {
            System.out.println(firstnum + " ");
            int nextnumber = firstnum + secondnum ;
            firstnum=secondnum;
            secondnum=nextnumber;

        }
    }
}
