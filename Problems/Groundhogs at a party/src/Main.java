import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int n = scanner.nextInt();
        boolean weeknd = scanner.nextBoolean();
        boolean successWeek = n >= 10 && n <= 20 && !weeknd;
    }
}