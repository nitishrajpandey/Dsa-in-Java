import java.util.Scanner;

public class Question8 {
    public static void main(String[] args){
        System.out.println("**** Check palindrome  ****");
        Scanner inputData = new Scanner(System.in);
        System.out.println("Enter string to check palindrom :  ");
        String value = inputData.nextLine();

        int i=0;
        int j=value.length()-1;
        int flag=0;

        while (i<j && flag==0){
            if (value.charAt(i) != value.charAt(j)) {
                flag=1;
            }
            i++;
            j--;
        }

        if (flag==1){
            System.out.println(value + " is not a Palindrom");
        }else {
            System.out.println(value + " is a Palindrom");
        }
    }
}
