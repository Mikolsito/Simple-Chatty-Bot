import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int nElements = scanner.nextInt();
        int max = 0;

        for (int i = 0; i < nElements; i++) {
            int element = scanner.nextInt();

            if (element > max && element % 4 == 0) {
                max = element;
            }
        }

        System.out.println(max);

    }
}