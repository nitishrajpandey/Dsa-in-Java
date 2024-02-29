import java.util.Scanner;

public class Question19 {
    public static void main(String[] args) {
        System.out.println("**** Find curved surface area of cylinder ***** ");
        Scanner inputData = new Scanner(System.in);
        System.out.println("Enter the  radius : ");
        float radius = inputData.nextFloat();
        System.out.println("Enter the height : ");
        float height = inputData.nextFloat();
        float curvedSurface = (float)( 2*Math.PI*radius*height);
        System.out.println("The curved surface area of cylinder is : " + curvedSurface);
    }
}
