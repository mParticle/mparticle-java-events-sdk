package com.mparticle;

public class Logger {
    private static AbstractLogHandler logHandler;
    public enum LogLevel {
        INFO, ERROR
    }

    public static void info(String message) {
        if(getLogHandler() != null)
            getLogHandler().log(LogLevel.INFO, null, message);
    }

    public static void error(String message) {
        if(getLogHandler() != null)
            getLogHandler().log(LogLevel.ERROR, null, message);
    }

    public static void error(Throwable error) {
        if(getLogHandler() != null)
            getLogHandler().log(LogLevel.ERROR, error, error.toString());
    }

    /**
     * Testing method. Use this method to intercept Logs, or customize what happens when something is logged.
     * For example, you can use this method to throw an exception every time an "error" log is called.
     * @param logListener
     */
    public static void setLogHandler(AbstractLogHandler logListener) {
        Logger.logHandler = logListener;
    }

    public static AbstractLogHandler getLogHandler() {
        return logHandler;
    }

    public abstract static class AbstractLogHandler {

        public void log(LogLevel priority, Throwable error, String message) {
            if (message != null) {
                switch (priority) {
                    case ERROR:
                        error(error, message);
                        break;
                    case INFO:
                        info(message);
                }
            }
        }

        public abstract void info(String message);
        public abstract void error(Throwable error, String message);
    }
}

