package classes;
import java.util.Scanner;
import Interfaces.TimeMode;

public class DigitalClock {
    private static boolean running = true;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (running) {
            System.out.println("\nSelect Mode:");
            System.out.println("1. Current Time");
            System.out.println("2. Stopwatch");
            System.out.println("3. Timer");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 
            
            TimeMode mode = null;
            switch (choice) {
                case 1:
                    mode = new Watch();
                    break;
                case 2:
                    mode = new Stopwatch(scanner);
                    break;
                case 3:
                    mode = new TimerMode(scanner);
                    break;
                case 4:
                    running = false;
                    System.out.println("Exiting application...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
            
            if (mode != null) {
                mode.start();
            }
        }
        scanner.close();
    }
}