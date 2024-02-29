import java.util.Scanner;

public class Question1 {
    public static void main(String[] args){
        System.out.println("**** Find the Area of circle *****");
        System.out.println("Enter tha radius : ");
        Scanner inputData = new Scanner(System.in);
        float radius = inputData.nextFloat();
        float Area = (float)  (Math.PI * (Math.pow(radius,2)));
        System.out.println("The Area of Circle is : "+ Area);

    }
}

