package com.logiscdweb.logiscd.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/logiscdweb/v1/logiscd/{logisId}")
public class logiscdController {

    @Value("${message}")
    private String message;

    @GetMapping(produces = "application/json")
    public ResponseEntity<String> getLogis(@PathVariable String logisId){
        return new ResponseEntity<>(message, HttpStatus.OK);
    }
}
