import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        System.out.println("**** Find the area of Equilateral triangle ****");
        Scanner inputData = new Scanner(System.in);
        System.out.println("Enter the side of Equilateral triangle : ");
        float side = inputData.nextFloat();
        float area = (float) ((Math.pow(3,0.5)/4)*(Math.pow(side,2)));
        System.out.println("The are of Equilateral triangle is : " + area);

    }
}
