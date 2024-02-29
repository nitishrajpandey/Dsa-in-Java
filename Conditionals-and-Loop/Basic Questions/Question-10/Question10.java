import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        System.out.println(" ****  find the perimeter of parallelogram *****");
        Scanner inputData = new Scanner(System.in);
        System.out.println("Enter the base : ");
        float base= inputData.nextFloat();
        System.out.println("Enter the Side : ");
        float side = inputData.nextFloat();
        float perimeter= 2*(base+side);
        System.out.println("The perimeter of parallelogram is : "+ perimeter);
    }
}
