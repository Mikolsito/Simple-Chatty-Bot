import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        int n4 = scanner.nextInt();
        int n5 = scanner.nextInt();
        int n6 = scanner.nextInt();
        int time1 = n1 * 3600 + n2 * 60 + n3;
        int time2 = n4 * 3600 + n5 *60 + n6;
        System.out.println(time2 - time1);
    }
}
