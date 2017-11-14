package de.cooperateproject.eabridge.logging;

import org.osgi.framework.Constants;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.log.LogEntry;
import org.osgi.service.log.LogListener;
import org.osgi.service.log.LogReaderService;
import org.osgi.service.log.LogService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(immediate=true)
public class SLF4JLoggingDelegate implements LogListener {
    private final Logger logger  = LoggerFactory.getLogger("org.osgi.framework");
        
    @Reference()
    public void addLogReader(LogReaderService lrs) {
        lrs.addLogListener(this);
    }

    public void removeLogReader(LogReaderService lrs) {
        lrs.removeLogListener(this);
    }
    
    @Override
    public void logged(LogEntry entry) {
        Logger logger = this.logger;
        if (entry.getServiceReference() != null) {
            Object name = entry.getServiceReference().getProperty(Constants.OBJECTCLASS);
            if (name != null) {
                if (name instanceof String[]) {
                    name = ((String[]) name)[0];
                }
                logger = LoggerFactory.getLogger(name.toString());
            }
        }

        log(logger, entry.getLevel(), entry.getMessage(), entry.getException());
    }
    
    private void log(Logger logger, int level, String message, Throwable exception) {
        switch (level) {
            case LogService.LOG_DEBUG:
                if (exception == null) {
                    logger.debug(message);
                } else {
                    logger.debug(message, exception);
                }
                break;
            case LogService.LOG_INFO:
                if (exception == null) {
                    logger.info(message);
                } else {
                    logger.info(message, exception);
                }
                break;
            case LogService.LOG_WARNING:
                if (exception == null) {
                    logger.warn(message);
                } else {
                    logger.warn(message, exception);
                }
                break;
            case LogService.LOG_ERROR:
                if (exception == null) {
                    logger.error(message);
                } else {
                    logger.error(message, exception);
                }
                break;
        }
    }
}
