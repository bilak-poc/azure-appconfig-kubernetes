package com.github.bilak.azureappconfigkubernetes;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
@RequiredArgsConstructor
public class TestRunner implements ApplicationRunner {

  private final TestProperties testProperties;

  @Override
  public void run(ApplicationArguments args) throws Exception {
    log.debug("Having test property {}", testProperties.getName());
  }
}
