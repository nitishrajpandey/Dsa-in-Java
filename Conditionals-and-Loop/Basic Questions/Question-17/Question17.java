import java.util.Scanner;

public class Question17 {
    public static void main(String[] args) {
        System.out.println("**** Find the Volume of Sphere ");
        Scanner inputData = new Scanner(System.in);
        System.out.println("Enter the radius : ");
        float radius = inputData.nextFloat();
        float volume = (float) ((4.0/3.0)*(Math.PI)*Math.pow(radius,3));
        System.out.println("The volume of Sphere is : " + volume);
    }
}
