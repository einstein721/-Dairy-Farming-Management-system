// AlertService.java
public interface AlertService {
    void sendAlert(String message);
}

// ConsoleAlertService.java
public class ConsoleAlertService implements AlertService {
    @Override
    public void sendAlert(String message) {
        System.out.println("ALERT: " + message);
    }
}
