import java.util.Scanner;

public class Question6 {
    public static void main(String[] args){
        System.out.println("**** Currency converter rupees to USD ****");
        Scanner inputData = new Scanner(System.in);
        System.out.println("Enter rupees amount ₹: ");
        float rupeesAmount =inputData.nextFloat();
        System.out.println("After converting USD amount is : "+ String.format("%.2f",(rupeesAmount*0.012))+"$");
    }
}
