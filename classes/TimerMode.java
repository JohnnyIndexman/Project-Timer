package classes;
import java.util.Scanner;
import Interfaces.TimeMode;

class TimerMode implements TimeMode {
    private Scanner scanner;

    public TimerMode(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public void start() {
        System.out.print("Enter countdown time in seconds: ");
        int countdown = scanner.nextInt();
        System.out.println("Timer started...");
        
        while (countdown > 0) {
            System.out.println("Time left: " + countdown + " seconds");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            countdown--;
        }
        System.out.println("Time's up!");
    }
}