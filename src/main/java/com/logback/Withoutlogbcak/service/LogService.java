package com.logback.Withoutlogbcak.service;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class LogService {

    public void logMessage(String message) {
        String maskedMessage = maskMobileNumber(message);
        log.info(maskedMessage);
    }

    private String maskMobileNumber(String message) {
        // Assuming mobile numbers are in the format XXX-XXXXXXX
        return message.replaceAll("\\b(\\d{3}-)\\d{7}\\b", "$1*******");
    }
}

