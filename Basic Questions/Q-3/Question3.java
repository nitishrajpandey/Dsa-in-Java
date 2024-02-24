import java.util.Scanner;

public class Question3 {
    public static void main(String[] args){
        System.out.print("Enter Principal amount : ");
        Scanner inputData = new Scanner(System.in);
        float principal = inputData.nextFloat();
        System.out.print("Enter time amount : ");
        float time = inputData.nextFloat();
        System.out.print("Enter Annual rate amount : ");
        float rate = inputData.nextFloat();
        float simple_Intrest = ((principal*time*rate)/100);
        System.out.println("The simple intrest is : " + simple_Intrest);
        System.out.println("The amount is : " + (simple_Intrest+principal));
    }
}
