import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        System.out.println("**** Find the area of Rhombus ****");
        Scanner inputData = new Scanner(System.in);
        System.out.println("Enter the Diagonal1 : ");
        float diagonal1 = inputData.nextFloat();
        System.out.println("Enter the Diagonal : ");
        float diagonal2 = inputData.nextFloat();
        float area = (float) ((diagonal2*diagonal1)*0.5);
        System.out.println("The area of Rhombus is : "+area);
    }
}
