package com.telstra.problem.problemstatement.service;

import com.telstra.problem.problemstatement.document.Incoming;
import com.telstra.problem.problemstatement.document.Outgoing;
import com.telstra.problem.problemstatement.repository.IncomingDataRepository;
import com.telstra.problem.problemstatement.repository.OutgoingDataRepository;
import com.telstra.problem.problemstatement.service.helper.DataServiceHelper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataService {

    private IncomingDataRepository incomingDataRepository;
    private OutgoingDataRepository outgoingDataRepository;
    private DataServiceHelper dataServiceHelper;

    public DataService(IncomingDataRepository incomingDataRepository,
                       OutgoingDataRepository outgoingDataRepository,
                       DataServiceHelper dataServiceHelper) {
        this.incomingDataRepository = incomingDataRepository;
        this.outgoingDataRepository = outgoingDataRepository;
        this.dataServiceHelper = dataServiceHelper;
    }

    public void process(Incoming incoming) {
        incoming = incomingDataRepository.save(incoming);
        Outgoing outgoing = prepareOutgoingData(incoming);
        outgoingDataRepository.save(outgoing);
    }

    private Outgoing prepareOutgoingData(Incoming incoming) {
        return Outgoing
                .builder()
                .id(incoming.getId())
                .largestNumber(dataServiceHelper.largestNumber(incoming.getNumbersMeetNumbers()))
                .duplicates(dataServiceHelper.findDuplicateCharacters(incoming.getFindDuplicates()))
                .trimmedString(dataServiceHelper.removeSpacesWithoutReplaceMethod(incoming.getWhiteSpacesGalore()))
                .build();
    }


    public List<Outgoing> retrieveData() {
        return outgoingDataRepository.findAll();
    }
}
