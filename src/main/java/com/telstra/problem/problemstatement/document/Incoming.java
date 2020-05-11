package com.telstra.problem.problemstatement.document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.NotEmpty;

@Document
@Getter
@Setter
@AllArgsConstructor
@ToString
@Builder
public class Incoming {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    @NotEmpty(message = "findDuplicates field is mandatory")
    private String findDuplicates;

    @NotEmpty(message = "whiteSpacesGalore field is mandatory")
    private String whiteSpacesGalore;

    private boolean validateMeOnlyIActuallyShouldBeABoolean;

    @NotEmpty(message = "numbersMeetNumbers field is mandatory")
    private Integer[] numbersMeetNumbers;
}
