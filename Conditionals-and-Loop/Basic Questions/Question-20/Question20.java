import java.util.Scanner;

public class Question20 {
    public static void main(String[] args) {
        System.out.println(" **** Find the total surface area of cube *****");
        Scanner inputData = new Scanner(System.in);
        System.out.println("Enter the edge : ");
        float edge=inputData.nextFloat();
        float totalSurface = (float) (6* Math.pow(edge,2));
        System.out.println("The total surface area of cube is : " + totalSurface);
    }
}
