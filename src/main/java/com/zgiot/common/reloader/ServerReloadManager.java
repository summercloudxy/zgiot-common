package com.zgiot.common.reloader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class ServerReloadManager {
    private static final List<Reloader> reloaders = new ArrayList<>(); // avoid dup register
    private static final Logger logger = LoggerFactory.getLogger(ServerReloadManager.class);

    public static void reloadAll() {
        for (Reloader reloader : reloaders) {
            logger.info("To reload: {}", reloader.getClass().getName());
            reloader.reload();
            logger.info("Reloaded: {}", reloader.getClass().getName());
        }
    }

    public static void addReloader(Reloader reloader) {
        if (reloaders.contains(reloader)){
            logger.warn("Reloader existed, don't register repeatly. (name=`{}`)",
                    reloader.getClass().getName() );
            return ;
        }

        reloaders.add(reloader);
        logger.info("Added reloader: {}", reloader.getClass().getName());
    }

    public static List<Reloader> getAllReloaders() {
        return reloaders;
    }

}
