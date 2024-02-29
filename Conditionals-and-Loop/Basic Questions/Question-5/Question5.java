import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        System.out.println("**** Find the area of parallogram ****");
        Scanner inputData = new Scanner(System.in);
        System.out.println("Enter the base of parallogram : ");
        float base = inputData.nextFloat();
        System.out.println("Enter the height of parallogram : ");
        float height = inputData.nextFloat();
        float area = (float) ((base*height)*0.5);
        System.out.println("The area of parallogram is : "+ area);
    }
}
