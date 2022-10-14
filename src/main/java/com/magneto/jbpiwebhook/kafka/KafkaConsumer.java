package com.magneto.jbpiwebhook.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

//import com.magneto.jbpiwebhook.payload.Payload;

@Service
public class KafkaConsumer {

	private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumer.class);
	
	@KafkaListener(topics="mssql.dbo.Emp", groupId="mssql-dbhistory")
	public void consume(String payload) {
		LOGGER.info(String.format("Message received -> %s", payload));
		
	}
}
