import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        System.out.println("**** Find the perimeter of circle ****");
        Scanner inputData = new Scanner(System.in);
        System.out.println("Enter the radius : ");
        float radius = inputData.nextFloat();
        float  perimeter = (float) (2* (Math.PI)*radius);
        System.out.println("The perimeter of circle is : " + perimeter);
    }
}
