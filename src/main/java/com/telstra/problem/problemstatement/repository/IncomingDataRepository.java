package com.telstra.problem.problemstatement.repository;

import com.telstra.problem.problemstatement.document.Incoming;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IncomingDataRepository extends MongoRepository<Incoming, String> {
}
