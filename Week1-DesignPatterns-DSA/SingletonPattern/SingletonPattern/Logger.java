import java.time.LocalDateTime;

public class Logger {

    // Single instance of Logger
    private static Logger instance;

    // Private constructor prevents object creation from outside
    private Logger() {
        System.out.println("Logger Initialized");
    }

    /**
     * Returns the single Logger instance.
     * Thread-safe using synchronized.
     */
    public static synchronized Logger getInstance() {

        if (instance == null) {
            instance = new Logger();
        }

        return instance;
    }

    /**
     * Logs informational messages.
     */
    public void info(String message) {
        System.out.println(
                "[" + LocalDateTime.now() + "] [INFO] " + message);
    }

    /**
     * Logs warning messages.
     */
    public void warning(String message) {
        System.out.println(
                "[" + LocalDateTime.now() + "] [WARNING] " + message);
    }

    /**
     * Logs error messages.
     */
    public void error(String message) {
        System.out.println(
                "[" + LocalDateTime.now() + "] [ERROR] " + message);
    }
}