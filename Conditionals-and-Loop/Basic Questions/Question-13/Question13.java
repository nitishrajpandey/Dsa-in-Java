import java.util.Scanner;

public class Question13 {
    public static void main(String[] args) {
        System.out.println("**** Find the perimeter of Rhombus *****");
        Scanner inputData = new Scanner(System.in);
        System.out.println("Enter the side : ");
        float side = inputData.nextFloat();
        float perimeter = 4* side;
        System.out.println("The perimeter of Rhombus : " + perimeter);
    }
}
