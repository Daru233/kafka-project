package com.daru.kafka.producer.publisher;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Properties;

public class Publisher {

    KafkaProducer<String, String> producer;
    Properties config;
    ProducerRecord<String, String> record;

    static Logger LOGGER = LoggerFactory.getLogger(Publisher.class);

    public Publisher() {
        loadConfig();
        createProducer();
    }

    private void loadConfig() {
        KafkaConfigBuilder configBuilder = new KafkaConfigBuilder();
        config = configBuilder.getProperties();
    }

    private void createProducer() {
        producer = new KafkaProducer<String, String>(config);
    }

    public void send(List<String> records){

    }

}
