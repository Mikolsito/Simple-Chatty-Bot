import java.util.Scanner;
class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int shipped = 0;
    int fixed = 0;
    int rejected = 0;
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();

            if (num == 0) {
            shipped += 1;
            } if (num == 1) {
            fixed += 1;
            } if (num == -1) {
            rejected += 1;
        }
    }

    System.out.print(shipped + " " + fixed + " " + rejected);

    }
}