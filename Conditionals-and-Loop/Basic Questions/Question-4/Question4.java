import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        System.out.println("**** Area of Triangle ****");
        Scanner inputData = new Scanner(System.in);
        System.out.println("Enter the side1 length : ");
        float side1= inputData.nextFloat();
        System.out.println("Enter the side2 length : ");
        float side2= inputData.nextFloat();
        System.out.println("Enter the side3 length : ");
        float side3= inputData.nextFloat();

        float semiPerimeter = ((side1+side2+side3)/2);
        System.out.println("The semi-perimeter is : " + semiPerimeter);
float logic = (semiPerimeter*(semiPerimeter-side1)*(semiPerimeter-side2)*(semiPerimeter-side3));
        float area = (float) (Math.pow(logic,0.5));
        System.out.println("The are of any triangle is : " + area);

    }
}
