package com.github.bilak.azureappconfigkubernetes;

import java.time.LocalDateTime;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class TestController {

  private final TestProperties testProperties;
  private final AzureProperties azureProperties;

  @GetMapping("/hello")
  String hello() {
    return "Hello " + testProperties.getName() + " " + LocalDateTime.now();
  }

  @GetMapping("/hello/{timeout}")
  String helloWithTimeout(@PathVariable Long timeout) throws InterruptedException {
    Thread.sleep(timeout * 1000);
    return "Timeout Hello " + testProperties.getName() + " " + LocalDateTime.now();
  }

  @GetMapping
  ResponseEntity<Map<String, Storage>> getStorages() {
    return ResponseEntity.ok(azureProperties.getStorages());
  }

  @GetMapping("/{timeout}")
  ResponseEntity<Map<String, Storage>> getStoragesWithTimeout(@PathVariable Long timeout) throws InterruptedException {
    Thread.sleep(timeout * 1000);
    return ResponseEntity.ok(azureProperties.getStorages());
  }
}
