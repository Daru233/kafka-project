package com.daru.kafka.producer;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class DataLoader {

    String csvPath;

    DataLoader(){
        getProperties();
    }

    private void getProperties() {
        try (InputStream input = new FileInputStream("src/main/resources/app.properties")) {

            Properties prop = new Properties();

            // load a properties file
            prop.load(input);

            // get and set path to csv
            csvPath = prop.getProperty("path");

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public String getCsvPath(){
        return this.csvPath;
    }

}