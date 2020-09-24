package com.github.bilak.azureappconfigkubernetes;

import java.time.LocalDateTime;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class TestController {

  private final TestProperties testProperties;

  @GetMapping
  String hello() {
    return "Hello " + testProperties.getName() + " " + LocalDateTime.now();
  }

  @GetMapping("/{timeout}")
  String helloWithTimeout(@PathVariable Long timeout) throws InterruptedException {
    Thread.sleep(timeout * 1000);
    return "Timeout Hello " + testProperties.getName() + " " + LocalDateTime.now();
  }
}
