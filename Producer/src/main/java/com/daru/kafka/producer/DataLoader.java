package com.daru.kafka.producer;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;

public class DataLoader {

    private String csvPackagePath;
    private String csvCompletePath;
    private List<String> records = new ArrayList<>();

    DataLoader(){
        loadProperties();
        getCompleteCsvPath();
        loadCsvData();
        removeHeaders();
    }

    private void loadProperties() {
        try (InputStream input = new FileInputStream("src/main/resources/app.properties")) {
            Properties prop = new Properties();
            prop.load(input);
            csvPackagePath = prop.getProperty("path");

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private void getCompleteCsvPath() {
        csvCompletePath = new File("").getAbsolutePath();
        csvCompletePath += csvPackagePath;
    }

    private void loadCsvData() {
        try {
            Scanner scanner = new Scanner(new File(csvCompletePath));
            scanner.useDelimiter("\\n");
            for(int i = 0; i <= 100; i++) {
                records.add(scanner.next());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void removeHeaders() {
        records.remove(0);
    }

    public List<String> getRecords(){
        return this.records;
    }

}