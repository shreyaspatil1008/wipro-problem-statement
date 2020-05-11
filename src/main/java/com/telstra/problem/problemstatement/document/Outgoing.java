package com.telstra.problem.problemstatement.document;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
@Getter
@Setter
@ToString
@Builder
public class Outgoing {

    @Id
    private String id;
    private Integer largestNumber;
    private List<Character> duplicates;
    private String trimmedString;
}
