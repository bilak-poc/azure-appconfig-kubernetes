package com.github.bilak.azureappconfigkubernetes;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Data
@Configuration
@ConfigurationProperties("test")
public class TestProperties {

  private String name;
}
