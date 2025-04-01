package classes;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
import Interfaces.TimeMode;

class Stopwatch implements TimeMode {
    private Scanner scanner;

    public Stopwatch(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public void start() {
        System.out.println("Press ENTER to start stopwatch...");
        scanner.nextLine();
        LocalTime startTime = LocalTime.now();
        System.out.println("Stopwatch started. Press ENTER to stop...");
        scanner.nextLine();
        LocalTime endTime = LocalTime.now();
        long elapsedSeconds = ChronoUnit.SECONDS.between(startTime, endTime);
        System.out.println("Elapsed Time: " + elapsedSeconds + " seconds");
    }
}
