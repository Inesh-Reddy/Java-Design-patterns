package dev.inesh.CentralizedLoggingService;

public class Logger {
    private static Logger instance;

    private Logger() {

    }

    public static Logger getInstance() {
        if (instance == null) {
            synchronized (Logger.class) {
                if (instance == null) {
                    instance = new Logger();
                }
            }
        }
        return instance;
    }

//     **Logging Methods:**
//    Define methods for writing log entries (e.g., `logInfo()`, `logError()`).
    public String logInfo(String message) {
        System.out.println("INFO: " + message);
        return message;
    }

    public String logError(String message) {
        System.out.println("ERROR: "+message);
        return message;
    }
}
