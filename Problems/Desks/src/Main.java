import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int G1 = scanner.nextInt() + 1;
        int G2 = scanner.nextInt() + 1;
        int G3 = scanner.nextInt() + 1;
        int desks =  G1 / 2 + G2 / 2 + G3 / 2;

        System.out.print(desks);

    }
}