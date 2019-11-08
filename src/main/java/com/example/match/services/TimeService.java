package com.example.match.services;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.ZoneId;

@RestController
@CrossOrigin(origins = "*", allowCredentials = "true", allowedHeaders = "*")
public class TimeService {

  @GetMapping("/api/time/{offset}")
  public LocalDateTime getTime(@PathVariable("offset") String offset) {

    int offSetValue = Integer.parseInt(offset);
    LocalDateTime dateTime = LocalDateTime.now(ZoneId.of("CET"));
    dateTime = dateTime.minusHours(1);
    dateTime = dateTime.minusHours(offSetValue);
    return dateTime;
  }
}
