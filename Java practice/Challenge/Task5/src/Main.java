import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = userInput.nextLine();
        System.out.println("Welcome "+ name +" to java programming");
    }
}