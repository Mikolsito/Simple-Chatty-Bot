import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        while (true) {

            number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            if (number % 2 != 0) {
                System.out.println("odd");
            } else if (number % 2 == 0) {
                System.out.println("even");
            }
        }
    }
}
