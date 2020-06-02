import java.util.Scanner;

class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int max = scanner.nextInt();
    int repeat = 1;
    int number = -1;
    for (int i = 0; i < max; i++) {
        number++;
        for (int k = 0; k < i; k++) {
            System.out.print(number + " ");
            repeat--;
            if (repeat == 0) {
                repeat += number;
                break;

            }
        }
    }
    }
}