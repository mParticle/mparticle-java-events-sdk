package com.mparticle.client;

import com.mparticle.Logger.AbstractLogHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DefaultLogHandler extends AbstractLogHandler {

    private static final Logger Log = LoggerFactory.getLogger(DefaultLogHandler.class);
    @Override
    public void info(String message) {
        Log.info(message);

    }

    @Override
    public void error(Throwable error, String message) {
        if (error != null) {
            Log.error(error.toString());
        } else {
            Log.error(message);
        }
    }
}
