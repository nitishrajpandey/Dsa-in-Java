import java.util.Scanner;

public class Question14 {
    public static void main(String[] args) {
        System.out.println("**** Find the Volume of cone ****");
        Scanner inputData = new Scanner(System.in);
        System.out.println("Enter the radius : ");
        float radius = inputData.nextFloat();
        System.out.println("Enter the height : ");
        float height = inputData.nextFloat();
        float volume = (float) ((Math.PI)*(Math.pow(radius,2))*(height/3));
        System.out.println("The volume of Cone is : " + volume);
    }
}
