package br.com.amqptest.amqptest;

import org.springframework.amqp.core.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DirectConfig {

  @Autowired
  private Queue Fila1;
  @Bean
  public Exchange directExchange() {
    return ExchangeBuilder
           .directExchange("EX_DIRECT")
           .durable(true)
           .build();
  }

  @Bean
  public Binding BindingFila001() {
    return BindingBuilder
        .bind(Fila1)
        .to(directExchange())
        .with("ROTA001")
        .noargs();
  }
}
