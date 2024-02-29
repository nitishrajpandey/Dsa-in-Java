import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        System.out.println("Find the perimeter of rectangle ****");
        Scanner inputData = new Scanner(System.in);
        System.out.println("Enter the length : ");
        float length = inputData.nextFloat();
        System.out.println("Enter the width : ");
        float width = inputData.nextFloat();
        float perimeter = 2*(length+width);
        System.out.println("The perimeter of rectangle is : " + perimeter);
    }
}
