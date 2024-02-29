import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        System.out.println("**** Find the perimeter of equilateral triangle *****");
        Scanner inputData = new Scanner(System.in);
        System.out.println("Enter the side : ");
        float side = inputData.nextFloat();
        float perimeter = 3*side;
        System.out.println("The perimeter of equilateral triangle is : " + perimeter );
    }
}
