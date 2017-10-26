package com.zgiot.common.reloader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public class ServerReloadManager {
    private static final Set<Reloader> reloaders = new CopyOnWriteArraySet<>(); // avoid dup register
    private static final Logger logger = LoggerFactory.getLogger(ServerReloadManager.class);

    public static void reloadAll() {
        for (Reloader reloader : reloaders) {
            logger.info("To reload: {}", reloader.getClass().getName());
            reloader.reload();
            logger.info("Reloaded: {}", reloader.getClass().getName());
        }
    }

    public static void addReloader(Reloader reloader) {
        reloaders.add(reloader);
        logger.info("Added reloader: {}", reloader.getClass().getName());
    }

}
