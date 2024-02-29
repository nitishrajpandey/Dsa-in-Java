import java.util.Scanner;

public class Question24 {
    public static void main(String[] args) {
        System.out.println("*** Take integer inputs till the user enter 0 and print the sum of all number.");
        Scanner inputData = new Scanner(System.in);
        System.out.println("Enter the integer : ");
        int total =0;
        while (true){
            int number = inputData.nextInt();
            if (number!=0) {
                total = total + number;
            } else if (number==0) {
                break;
            }

        }
        System.out.println(total);
    }
}
