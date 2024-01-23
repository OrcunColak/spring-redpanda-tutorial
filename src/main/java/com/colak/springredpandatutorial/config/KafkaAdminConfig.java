package com.colak.springredpandatutorial.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.KafkaAdmin;

@Configuration
public class KafkaAdminConfig {

    @Autowired
    public void configureTopic(KafkaAdmin kafkaAdmin) {
        NewTopic newTopic = new NewTopic(Constants.TOPIC, Constants.NUM_PARTITIONS, Constants.REPLICATION_FACTOR);
        kafkaAdmin.createOrModifyTopics(newTopic);
    }

    // Old way of creating KafkaAdmin and topics
    /*
    @Bean
    public KafkaAdmin kafkaAdmin() {
        Map<String, Object> configs = new HashMap<>();
        configs.put(AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapAddress);
        return new KafkaAdmin(configs);
    }
    //this bean will see if there's a topic already created, if not, it will create it for you
    @Bean
    public NewTopic initialTopic() {
        return new NewTopic(Constants.TOPIC, Constants.NUM_PARTITIONS,  Constants.REPLICATION_FACTOR);
    }
     */
}
