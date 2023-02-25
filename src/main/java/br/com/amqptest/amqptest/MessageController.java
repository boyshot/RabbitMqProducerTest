package br.com.amqptest.amqptest;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("exchanges")
public class MessageController {
  @Autowired
  private RabbitTemplate rabbitTemplate;

  @PostMapping("/")
  public ResponseEntity GerarMensagem() {

      rabbitTemplate.convertAndSend("EX_DIRECT", "ROTA001", UUID.randomUUID().toString());

    return ResponseEntity.ok().build();
  }
}
