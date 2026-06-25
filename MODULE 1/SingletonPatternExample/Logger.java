public class Logger {

    private Logger() {
        System.out.println("Logger instance created.");
    }

    private static class LoggerHolder {
        private static final Logger INSTANCE = new Logger();
    }

    static Logger getInstance() {
        return LoggerHolder.INSTANCE;
    }

}
