import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        int z = 0;
        for (; a <= b; a++) {
        if (a % n == 0) {
            z += 1;
        }
        }
        System.out.println(z);
    }
}