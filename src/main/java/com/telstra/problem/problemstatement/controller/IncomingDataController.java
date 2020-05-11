package com.telstra.problem.problemstatement.controller;

import com.telstra.problem.problemstatement.document.Incoming;
import com.telstra.problem.problemstatement.service.DataService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class IncomingDataController {

    private DataService dataService;

    public IncomingDataController(DataService dataService) {

        this.dataService = dataService;
    }

    @PostMapping("/incoming")
    public ResponseEntity<Void> processIncomingData(@Valid @RequestBody Incoming incoming) {

        dataService.process(incoming);

        return new ResponseEntity("Success",
                HttpStatus.CREATED);
    }
}