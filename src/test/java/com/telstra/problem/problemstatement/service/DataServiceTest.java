package com.telstra.problem.problemstatement.service;

import com.telstra.problem.problemstatement.document.Incoming;
import com.telstra.problem.problemstatement.document.Outgoing;
import com.telstra.problem.problemstatement.repository.IncomingDataRepository;
import com.telstra.problem.problemstatement.repository.OutgoingDataRepository;
import com.telstra.problem.problemstatement.service.helper.DataServiceHelper;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

@ExtendWith(MockitoExtension.class)
class DataServiceTest {

    @Mock
    private IncomingDataRepository mockIncomingDataRepository;

    @Mock
    private OutgoingDataRepository mockOutgoingDataRepository;

    @Mock
    private DataServiceHelper dataServiceHelper;

    @InjectMocks
    private DataService dataService;

    @Test
    void shouldSavedDataSuccessfully() {
        Integer[] arr = new Integer[]{10, 11, 13};
        Incoming incoming = Incoming
                .builder()
                .id("100")
                .findDuplicates("TEST")
                .numbersMeetNumbers(arr)
                .whiteSpacesGalore("White space")
                .validateMeOnlyIActuallyShouldBeABoolean(true)
                .build();
        BDDMockito.given(mockIncomingDataRepository.save(incoming)).willAnswer(invocationOnMock -> invocationOnMock.getArgument(0));

        dataService.process(incoming);

        BDDMockito.verify(mockIncomingDataRepository).save(ArgumentMatchers.any(Incoming.class));
        BDDMockito.verify(mockOutgoingDataRepository).save(ArgumentMatchers.any(Outgoing.class));
        BDDMockito.verify(dataServiceHelper).removeSpacesWithoutReplaceMethod(ArgumentMatchers.anyString());
        BDDMockito.verify(dataServiceHelper).findDuplicateCharacters(ArgumentMatchers.anyString());
        BDDMockito.verify(dataServiceHelper).largestNumber(ArgumentMatchers.any());

    }

    @Test
    void validateRetrieveData() {
        Outgoing outgoing = Outgoing
                .builder()
                .id("100")
                .duplicates(List.of('a', 'b'))
                .largestNumber(13)
                .trimmedString("Whitespace")
                .build();
        BDDMockito.given(
                mockOutgoingDataRepository.findAll()
        ).willReturn(
                List.of(outgoing)
        );
        List<Outgoing> outgoingList = dataService.retrieveData();

        Assert.assertEquals(outgoingList.size(), List.of(outgoing).size());
    }
}