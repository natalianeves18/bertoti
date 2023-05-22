class Logger {
    private static Logger instance;
    private String logFile;

    private Logger() {
        logFile = "application.log";
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("Registrando a mensagem no arquivo " + logFile + ": " + message);
    }
}