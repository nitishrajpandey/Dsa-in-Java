import java.util.Scanner;

public class Question18 {
    public static void main(String[] args) {
        System.out.println("**** Find the Volume of Pyramid ***");
        Scanner inputData = new Scanner(System.in);
        System.out.println("Enter the Base length : ");
        float baseLength = inputData.nextFloat();
        System.out.println("Enter the Base width : ");
        float baseWidth = inputData.nextFloat();
        System.out.println("Enter the Pyramid height : ");
        float height = inputData.nextFloat();
        float volume = (baseLength*baseWidth*height)/3;
        System.out.println("The volume of Pyramid is : " + volume);
    }
}
