package br.com.amqptest.amqptest;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.QueueBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QueueConfig {

  @Bean
  public Queue Fila1() {
    return QueueBuilder
          .durable("Fila_001")
          .build();
  }
}
