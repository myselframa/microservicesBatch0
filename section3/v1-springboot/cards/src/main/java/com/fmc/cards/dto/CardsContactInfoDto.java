package com.fmc.cards.dto;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;

@ConfigurationProperties(prefix = "accounts")
public record CardsContactInfoDto(String message, Map<String, String> contactDetails, List<String> onCallSupport) {

}