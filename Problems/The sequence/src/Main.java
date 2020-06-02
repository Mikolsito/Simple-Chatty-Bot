import java.util.Scanner;

class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int max = 0;
    while (scanner.hasNextInt()) {
        int num = scanner.nextInt();
        if (num > max && num % 4 == 0) {
            max = num;
        }
    }
    System.out.print(max);
    }
}