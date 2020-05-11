package com.telstra.problem.problemstatement.controller;

import com.telstra.problem.problemstatement.controller.base.AbstractTest;
import com.telstra.problem.problemstatement.document.Incoming;
import org.junit.Before;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.Assert.assertEquals;


public class IncomingDataControllerTest extends AbstractTest {

    @Override
    @Before
    public void setUp() {
        super.setUp();
    }

    @Test
    public void createIncomingData() throws Exception {
        String uri = "/incoming";
        Incoming incoming = Incoming
                .builder()
                .id("100")
                .findDuplicates("TEST")
                .numbersMeetNumbers(new Integer[]{10, 11, 13})
                .whiteSpacesGalore("White space")
                .validateMeOnlyIActuallyShouldBeABoolean(true)
                .build();

        String inputJson = super.mapToJson(incoming);
        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.post(uri)
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                .content(inputJson)).andReturn();

        int status = mvcResult.getResponse().getStatus();
        assertEquals(201, status);
        String content = mvcResult.getResponse().getContentAsString();
        assertEquals(content, "Success");
    }

    @Test
    public void validateIncomingDataFindDuplicates() throws Exception {
        String uri = "/incoming";
        Incoming incoming = Incoming
                .builder()
                .id("100")
                .numbersMeetNumbers(new Integer[]{10, 11, 13})
                .whiteSpacesGalore("White space")
                .validateMeOnlyIActuallyShouldBeABoolean(true)
                .build();

        String inputJson = super.mapToJson(incoming);
        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.post(uri)
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                .content(inputJson)).andReturn();

        int status = mvcResult.getResponse().getStatus();
        assertEquals(400, status);
        String content = mvcResult.getResponse().getContentAsString();
        assertEquals(content, "{\"findDuplicates\":\"findDuplicates field is mandatory\"}");
    }

    @Test
    public void validateIncomingDataNumbersMeetNumbers() throws Exception {
        String uri = "/incoming";
        Incoming incoming = Incoming
                .builder()
                .id("100")
                .findDuplicates("TEST")
                .whiteSpacesGalore("White space")
                .validateMeOnlyIActuallyShouldBeABoolean(true)
                .build();

        String inputJson = super.mapToJson(incoming);
        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.post(uri)
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                .content(inputJson)).andReturn();

        int status = mvcResult.getResponse().getStatus();
        assertEquals(400, status);
        String content = mvcResult.getResponse().getContentAsString();
        assertEquals(content, "{\"numbersMeetNumbers\":\"numbersMeetNumbers field is mandatory\"}");
    }

    @Test
    public void validateIncomingDataWhiteSpacesGalore() throws Exception {
        String uri = "/incoming";
        Incoming incoming = Incoming
                .builder()
                .id("100")
                .findDuplicates("TEST")
                .numbersMeetNumbers(new Integer[]{10, 11, 13})
                .validateMeOnlyIActuallyShouldBeABoolean(true)
                .build();

        String inputJson = super.mapToJson(incoming);
        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.post(uri)
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                .content(inputJson)).andReturn();

        int status = mvcResult.getResponse().getStatus();
        assertEquals(400, status);
        String content = mvcResult.getResponse().getContentAsString();
        assertEquals(content, "{\"whiteSpacesGalore\":\"whiteSpacesGalore field is mandatory\"}");
    }
}
