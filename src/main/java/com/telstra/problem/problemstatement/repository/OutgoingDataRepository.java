package com.telstra.problem.problemstatement.repository;

import com.telstra.problem.problemstatement.document.Outgoing;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OutgoingDataRepository extends MongoRepository<Outgoing, String> {
}
