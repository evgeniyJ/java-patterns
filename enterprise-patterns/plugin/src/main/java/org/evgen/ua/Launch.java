package org.evgen.ua;

import java.io.File;
import java.math.BigDecimal;
import java.net.URL;

public class Launch {

    public static void main(String[] args) {
        String testPropertiesPath = getPath("test.properties");
        String prodPropertiesPath = getPath("prod.properties");
        System.setProperty(Plugin.PLUGINS_FILE, testPropertiesPath);
        Plugin.reload();
        Processor processor = Plugin.getPlugin(Processor.class);
        processor.process(BigDecimal.ONE);
        System.out.println(processor.getClass());
        System.setProperty(Plugin.PLUGINS_FILE, prodPropertiesPath);
        Plugin.reload();
        Processor processorNew = Plugin.getPlugin(Processor.class);
        processorNew.process("test");
        System.out.println(processorNew.getClass());
    }

    private static String getPath(String fileName) {
        URL url = Launch
                .class
                .getClassLoader()
                .getResource(fileName);
        return new File(url.getFile()).toPath().toString();
    }
}
