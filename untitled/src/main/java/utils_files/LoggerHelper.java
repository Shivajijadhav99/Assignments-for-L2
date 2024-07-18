package utils_files;


import org.apache.log4j.PropertyConfigurator;
import org.apache.logging.log4j.Logger;



public class LoggerHelper {
    private static boolean root = false;

    public static Logger getLogger(Class cls) {
        if (root) {
            return Logger.class.cast(cls);
        }
        PropertyConfigurator.configure("src/test/Resources/Logs/log4j.properties");
        root = true;
        return Logger.class.cast(cls);
    }
    }
