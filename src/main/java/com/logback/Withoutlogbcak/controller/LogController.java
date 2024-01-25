package com.logback.Withoutlogbcak.controller;


import com.logback.Withoutlogbcak.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class LogController {

    @Autowired
    private LogService logService;

    @GetMapping("/log")
    public String logMessage() {
        String mobileNumber = "123-4567890";
        logService.logMessage("Logging message with mobile number: " + mobileNumber);
        return "Message logged. Check the logs for details.";
    }
}
