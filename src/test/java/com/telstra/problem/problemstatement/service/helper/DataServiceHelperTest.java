package com.telstra.problem.problemstatement.service.helper;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class DataServiceHelperTest {

    private DataServiceHelper dataServiceHelper;

    public DataServiceHelperTest() {
        this.dataServiceHelper = new DataServiceHelper();
    }


    @Test
    void removeSpacesWithoutReplaceMethod() {
        String actual = dataServiceHelper.removeSpacesWithoutReplaceMethod("Test this");
        assertEquals(actual, "Testthis");
    }

    @Test
    void removeSpacesWithoutReplaceMethodFail() {
        String actual = dataServiceHelper.removeSpacesWithoutReplaceMethod("Test this");
        assertNotEquals(actual, "Test This");
    }

    @Test
    void findDuplicateCharacters() {
        List<Character> actual = dataServiceHelper.findDuplicateCharacters("Test this");
        assertEquals(actual, List.of('s', 't'));
    }

    @Test
    void findDuplicateCharactersFail() {
        List<Character> actual = dataServiceHelper.findDuplicateCharacters("Test this");
        assertNotEquals(actual, List.of('T', 'e', 's', 'h', 'i'));
    }

    @Test
    void largestNumber() {
        Integer actual = dataServiceHelper.largestNumber(new Integer[]{5, 4});
        assertEquals(actual, 5);
    }

    @Test
    void largestNumberFail() {
        Integer actual = dataServiceHelper.largestNumber(new Integer[]{5, 4});
        assertNotEquals(actual, 4);
    }
}