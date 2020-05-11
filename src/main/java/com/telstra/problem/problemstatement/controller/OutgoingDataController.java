package com.telstra.problem.problemstatement.controller;

import com.telstra.problem.problemstatement.document.Outgoing;
import com.telstra.problem.problemstatement.service.DataService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OutgoingDataController {

    private DataService dataService;

    public OutgoingDataController(DataService dataService) {

        this.dataService = dataService;
    }

    @GetMapping("/outgoing")
    public ResponseEntity<List<Outgoing>> retrieveOutgoingData() {

        return new ResponseEntity(
                dataService.retrieveData(),
                new HttpHeaders(),
                HttpStatus.OK
        );
    }
}