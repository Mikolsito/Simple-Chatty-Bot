import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int h = scanner.nextInt();
    int numBridges = scanner.nextInt();
    for (int i = 0; i < numBridges; i++) {
        int bridge = scanner.nextInt();
        if (bridge <= h) {
            System.out.print("Will crash on bridge " + (i + 1));
            break;
        }
        if (i == numBridges - 1) {
            System.out.print("Will not crash");
        }
    }
    }
}