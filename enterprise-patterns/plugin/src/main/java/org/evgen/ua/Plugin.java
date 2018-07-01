package org.evgen.ua;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

public final class Plugin {

    public static final String PLUGINS_FILE = "plugins.properties";

    private static final Properties PROPERTIES = new Properties();

    private Plugin() {
        throw new UnsupportedOperationException();
    }

    public static void reload() {
        try {
            PROPERTIES.load(
                    Files.newBufferedReader(
                            Paths.get(
                                    System.getProperty(PLUGINS_FILE)
                            )
                    )
            );
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(0);
        }
    }

    @SuppressWarnings("unchecked")
    public static <T> T getPlugin(Class<T> clazz) {
        try {
            return (T) Class.forName((String) PROPERTIES.get(clazz.getName())).newInstance();
        } catch (Exception e) {
            throw new IllegalArgumentException("Invalid clazz to load " + clazz.getName());
        }
    }
}
