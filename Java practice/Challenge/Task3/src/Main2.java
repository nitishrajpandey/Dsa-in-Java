public class Main2 {
    public static void main(String[] args) {
        System.out.println("Left half pyramid");
        for (int i = 0; i < 5; i++) {
            for (int j = i; j <5-1 ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
