import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        System.out.println("**** Find the perimeter of square ****");
        Scanner inputData = new Scanner(System.in);
        System.out.println("Enter the side : ");
        float side = inputData.nextFloat();
        float perimeter = 4*side;
        System.out.println("The perimeter of square is : "+ perimeter);
    }
}
