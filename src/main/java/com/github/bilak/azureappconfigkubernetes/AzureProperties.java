package com.github.bilak.azureappconfigkubernetes;

import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Data
@Configuration
@ConfigurationProperties("azure")
public class AzureProperties {

  private Map<String, Storage> storages;
}
