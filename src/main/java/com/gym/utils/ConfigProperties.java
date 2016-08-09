package com.gym.utils;

import java.io.IOException;
import java.net.URL;
import java.util.Properties;

/**
 * Created by mhap on 09.08.2016.
 */
public class ConfigProperties {
    private static Properties PROPERTIES;
    static {
        PROPERTIES = new Properties();
        URL props = ClassLoader.getSystemResource("config.properties");
        try {
            PROPERTIES.load(props.openStream());
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static String getProperty(String key){
        return PROPERTIES.getProperty(key);
    }
}
