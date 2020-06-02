import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int duration = scanner.nextInt();
        int foodCost = scanner.nextInt();
        int flightCost = scanner.nextInt();
        int costPerNight = scanner.nextInt();
        int totalCost = duration * foodCost + flightCost * 2 + (duration - 1) * costPerNight;
        System.out.print(totalCost);
    }
}