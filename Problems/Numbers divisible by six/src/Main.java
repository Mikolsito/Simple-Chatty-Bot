import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
            for (int i = 0; i <= n; i++) {
                 int var = scanner.nextInt();

                if (var % 6 == 0) {
                sum += var;
            }
        }
        System.out.println(sum);
    }
}