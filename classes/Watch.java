package classes;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import Interfaces.TimeMode;

class Watch implements TimeMode {
    @Override
    public void start() {
        LocalTime time = LocalTime.now();
        System.out.println("Current Time: " + time.truncatedTo(ChronoUnit.SECONDS));
    }
}
