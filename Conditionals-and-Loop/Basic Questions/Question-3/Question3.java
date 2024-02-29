import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        System.out.println("**** Area of rectangle ****");
        Scanner inputData = new Scanner(System.in);
        System.out.println("Enter the width of rectangle : ");
        float width = inputData.nextFloat();
        System.out.println("Enter the Length of rectangle : ");
        float length = inputData.nextFloat();
        float area = width*length;
        System.out.println("The area of rectangle is  : "+ area);
    }
}
