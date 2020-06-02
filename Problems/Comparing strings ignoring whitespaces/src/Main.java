import java.util.Scanner;
class Main {

    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        String noWhiteSpaces1 = str1.replace(" ", "");
        String noWhiteSpaces2 = str2.replace(" ", "");
        System.out.println(noWhiteSpaces1.equals(noWhiteSpaces2));
    }
}