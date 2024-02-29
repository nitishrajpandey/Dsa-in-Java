import java.util.Scanner;

public class Question15 {
    public static void main(String[] args) {
        System.out.println("**** Find the Volume of Prism *****");
        Scanner inputData = new Scanner(System.in);
        System.out.println("Enter the base area : ");
        float baseArea = inputData.nextFloat();
        System.out.println("Enter the Height : ");
        float height = inputData.nextFloat();
        float volume = baseArea*height;
        System.out.println("The volume of Prism is : " + volume);
    }
}
