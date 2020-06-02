import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int previous = scanner.nextInt();
        int num = previous;

        boolean bigger = false;
        boolean smaller = false;
        while (num != 0) {
            num = scanner.nextInt();
            if (num > previous) {
                bigger = true;
            }
            else if (num < previous) {
                smaller = true;
            }
            previous = num;
        }
        if (bigger ^ smaller) {
            System.out.print(true);
        } else {
            System.out.print(false);
        }
    }
}