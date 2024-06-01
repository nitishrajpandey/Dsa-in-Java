import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter your first name : ");
        String firstName = userInput.nextLine();
        System.out.println("Good morning "+firstName);
        System.out.print(firstName +" Enter your age also : ");
        int age = userInput.nextInt();
        System.out.println(firstName+" your age is "+age);

    }

}