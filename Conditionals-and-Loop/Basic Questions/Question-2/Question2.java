import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        System.out.println("**** Find Area of Isosceles Triangle ****");
        Scanner inputData = new Scanner(System.in);
        System.out.println("Enter the Height of Isosceles Triangle : ");
        float height = inputData.nextFloat();
        System.out.println("Enter the base of Isosceles Triangle : ");
        float base = inputData.nextFloat();
        float area = (float)(0.5*(height*base));
        System.out.println("The Area of Isosceles Triangle is : " + area );

    }
}

