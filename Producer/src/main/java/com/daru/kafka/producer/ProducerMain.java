package com.daru.kafka.producer;

import com.daru.kafka.producer.publisher.Publisher;

import java.io.FileNotFoundException;
import java.util.List;

public class ProducerMain {

    public static void main(String[] args) throws FileNotFoundException {

        // load data to publish
        DataLoader data = new DataLoader();
        List<String> records = data.getRecords();

        for(String record : records){
            System.out.println(record);
        }

        Publisher publisher = new Publisher();
        publisher.send(records);

        // create producer

        // create producer records

        // send data

        // flush and close producer

    }

}
