package com.gym.pages;

import com.gym.utils.ConfigProperties;
import jdk.nashorn.internal.runtime.regexp.joni.Config;

/**
 * Created by mhap on 09.08.2016.
 */
public class MainPage extends Page {
    @Override
    public void open() {
        driver.get(ConfigProperties.getProperty("main_url"));

    }
}
