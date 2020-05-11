package com.telstra.problem.problemstatement.controller;

import com.telstra.problem.problemstatement.controller.base.AbstractTest;
import com.telstra.problem.problemstatement.document.Outgoing;
import org.junit.Before;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.List;

import static org.junit.Assert.assertEquals;


public class OutgoingDataControllerTest extends AbstractTest {

    @Override
    @Before
    public void setUp() {
        super.setUp();
    }

    @Test
    public void createIncomingData() throws Exception {
        String uri = "/outgoing";
        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri)
                .contentType(MediaType.APPLICATION_JSON_VALUE)).andReturn();

        int status = mvcResult.getResponse().getStatus();
        assertEquals(200, status);
        List actual = mapFromJson(mvcResult.getResponse().getContentAsString(), List.class);
        System.out.println(mvcResult.getResponse().getContentAsString());
        List expected = mapFromJson("[{\"id\":\"1099\",\"largestNumber\":100,\"duplicates\":[\"a\",\"c\",\"e\",\"H\",\"r\",\"t\"],\"trimmedString\":\"Canwereplaceallthiswhitespaceswithoutusingreplaceplease\"},{\"id\":\"5eb4318c4968393e8a2a1533\",\"largestNumber\":100,\"duplicates\":[\"a\",\"c\",\"e\",\"H\",\"r\",\"t\"],\"trimmedString\":\"Canwereplaceallthiswhitespaceswithoutusingreplaceplease\"},{\"id\":\"5eb4319f4968393e8a2a1534\",\"largestNumber\":100,\"duplicates\":[\"a\",\"c\",\"e\",\"H\",\"r\",\"t\"],\"trimmedString\":\"Canwereplaceallthiswhitespaceswithoutusingreplaceplease\"},{\"id\":\"100\",\"largestNumber\":13,\"duplicates\":[\"T\"],\"trimmedString\":\"Whitespace\"},{\"id\":\"5eb80f7f48a83153a15ffcbe\",\"largestNumber\":100,\"duplicates\":[\"a\",\"c\",\"e\",\"H\",\"r\",\"t\"],\"trimmedString\":\"Canwereplaceallthiswhitespaceswithoutusingreplaceplease\"},{\"id\":\"5eb80f7f48a83153a15ffcbf\",\"largestNumber\":100,\"duplicates\":[\"a\",\"c\",\"e\",\"H\",\"r\",\"t\"],\"trimmedString\":\"Canwereplaceallthiswhitespaceswithoutusingreplaceplease\"},{\"id\":\"5eb81a0e1e0a1512995e0630\",\"largestNumber\":100,\"duplicates\":[\"a\",\"c\",\"e\",\"H\",\"r\",\"t\"],\"trimmedString\":\"Canwereplaceallthiswhitespaceswithoutusingreplaceplease\"},{\"id\":\"5eb81f1d7af823209d9b4757\",\"largestNumber\":100,\"duplicates\":[\"a\",\"c\",\"e\",\"H\",\"r\",\"t\"],\"trimmedString\":\"Canwereplaceallthiswhitespaceswithoutusingreplaceplease\"},{\"id\":\"5eb81f1e7af823209d9b4758\",\"largestNumber\":100,\"duplicates\":[\"a\",\"c\",\"e\",\"H\",\"r\",\"t\"],\"trimmedString\":\"Canwereplaceallthiswhitespaceswithoutusingreplaceplease\"},{\"id\":\"5eb81f60e122ab69fdb5f40e\",\"largestNumber\":100,\"duplicates\":[\"a\",\"c\",\"e\",\"H\",\"r\",\"t\"],\"trimmedString\":\"Canwereplaceallthiswhitespaceswithoutusingreplaceplease\"},{\"id\":\"5eb82036544d914125b66509\",\"largestNumber\":100,\"duplicates\":[\"a\",\"c\",\"e\",\"H\",\"r\",\"t\"],\"trimmedString\":\"Canwereplaceallthiswhitespaceswithoutusingreplaceplease\"},{\"id\":\"5eb82096f6239d0b0a348423\",\"largestNumber\":100,\"duplicates\":[\"a\",\"c\",\"e\",\"H\",\"r\",\"t\"],\"trimmedString\":\"Canwereplaceallthiswhitespaceswithoutusingreplaceplease\"},{\"id\":\"5eb821239f85ee3dfd667d12\",\"largestNumber\":100,\"duplicates\":[\"a\",\"c\",\"e\",\"H\",\"r\",\"t\"],\"trimmedString\":\"Canwereplaceallthiswhitespaceswithoutusingreplaceplease\"},{\"id\":\"5eb821279f85ee3dfd667d13\",\"largestNumber\":100,\"duplicates\":[\"a\",\"c\",\"e\",\"H\",\"r\",\"t\"],\"trimmedString\":\"Canwereplaceallthiswhitespaceswithoutusingreplaceplease\"},{\"id\":\"5eb821289f85ee3dfd667d14\",\"largestNumber\":100,\"duplicates\":[\"a\",\"c\",\"e\",\"H\",\"r\",\"t\"],\"trimmedString\":\"Canwereplaceallthiswhitespaceswithoutusingreplaceplease\"},{\"id\":\"5eb821289f85ee3dfd667d15\",\"largestNumber\":100,\"duplicates\":[\"a\",\"c\",\"e\",\"H\",\"r\",\"t\"],\"trimmedString\":\"Canwereplaceallthiswhitespaceswithoutusingreplaceplease\"},{\"id\":\"5eb821289f85ee3dfd667d16\",\"largestNumber\":100,\"duplicates\":[\"a\",\"c\",\"e\",\"H\",\"r\",\"t\"],\"trimmedString\":\"Canwereplaceallthiswhitespaceswithoutusingreplaceplease\"},{\"id\":\"5eb8243f5e783c721acfce8b\",\"largestNumber\":100,\"duplicates\":[\"a\",\"c\",\"e\",\"H\",\"r\",\"t\"],\"trimmedString\":\"Canwereplaceallthiswhitespaceswithoutusingreplaceplease\"},{\"id\":\"5eb824405e783c721acfce8c\",\"largestNumber\":100,\"duplicates\":[\"a\",\"c\",\"e\",\"H\",\"r\",\"t\"],\"trimmedString\":\"Canwereplaceallthiswhitespaceswithoutusingreplaceplease\"},{\"id\":\"5eb8b9dc1ca941364a73ddb2\",\"largestNumber\":100,\"duplicates\":[\"a\",\"c\",\"e\",\"H\",\"r\",\"t\"],\"trimmedString\":\"Canwereplaceallthiswhitespaceswithoutusingreplaceplease\"},{\"id\":\"5eb8b9dd1ca941364a73ddb3\",\"largestNumber\":100,\"duplicates\":[\"a\",\"c\",\"e\",\"H\",\"r\",\"t\"],\"trimmedString\":\"Canwereplaceallthiswhitespaceswithoutusingreplaceplease\"},{\"id\":\"5eb8ba791ca941364a73ddb4\",\"largestNumber\":100,\"duplicates\":[\"T\"],\"trimmedString\":\"TESTING\"},{\"id\":\"5eb8ba7a1ca941364a73ddb5\",\"largestNumber\":100,\"duplicates\":[\"T\"],\"trimmedString\":\"TESTING\"}]", List.class);
        assertEquals(expected, actual);
    }
}
