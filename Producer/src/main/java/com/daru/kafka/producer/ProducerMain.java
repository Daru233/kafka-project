package com.daru.kafka.producer;

import java.io.FileNotFoundException;

public class ProducerMain {

    public static void main(String[] args) throws FileNotFoundException {

        // load data to publish
        DataLoader data = new DataLoader();
        System.out.println(data.getCsvPath());

//        List<String> records = new ArrayList<>();
//
//        try {
//            Scanner scanner = new Scanner(new File(path));
//            scanner.useDelimiter("\\n");
//
//            for(int i = 0; i <= 5000; i++) {
//                records.add(scanner.next());
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//
//        for(String record : records){
//            System.out.println(record);
//        }

    }

}
