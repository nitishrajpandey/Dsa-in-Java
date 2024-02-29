import java.util.Scanner;

public class Question25 {
    public static void main(String[] args) {
        System.out.println("**** Take integer inputs till the user enter 0 and print the largest number from all ****");
        Scanner inputData = new Scanner(System.in);
        System.out.println("Enter the integer : ");
        int cheker=1;
        while (true){
            int number = inputData.nextInt();
            if (number!=0){
                if (cheker>number) {
                    cheker= cheker;
                }else {
                    cheker=number;
                }

            } else if (number == 0) {
                System.out.println(" The largest number is : "+ cheker);
            }
        }
    }
}
