public class Main1 {
    public static void main(String[] args) {

        System.out.println("Reverse Right half pyramid");
        for (int i = 5; i>=0; i--) {
            for (int j = 0; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
