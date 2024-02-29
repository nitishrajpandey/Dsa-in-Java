import java.util.Scanner;

public class Question23 {
    public static void main(String[] args) {
        System.out.println("*** Find all the factor of given input ****");
        Scanner inputData = new Scanner(System.in);
        System.out.println("Enter the number to find factor : ");
        int number = inputData.nextInt();

        for (int i = 1; i <=number ; i++) {
            if (number%i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
