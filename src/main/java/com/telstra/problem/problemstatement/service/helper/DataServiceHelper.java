package com.telstra.problem.problemstatement.service.helper;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class DataServiceHelper {

    public String removeSpacesWithoutReplaceMethod(String whiteSpacesGalore) {
        String withoutSpaces = "";
        for (int i = 0; i < whiteSpacesGalore.length(); i++) {
            if (whiteSpacesGalore.charAt(i) != ' ')
                withoutSpaces += whiteSpacesGalore.charAt(i);
        }
        return withoutSpaces;
    }

    public List<Character> findDuplicateCharacters(String findDuplicates) {
        Map<Character, Integer> map = getEachCharacterCount(findDuplicates);
        List<Character> duplicateCharacters = new ArrayList<>();
        for (char c : map.keySet()) {
            if (map.get(c) > 1) {
                duplicateCharacters.add(c);
            }
        }
        return duplicateCharacters;
    }

    private Map<Character, Integer> getEachCharacterCount(String findDuplicates) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : findDuplicates.toCharArray()) {
            if (map.containsKey(c)) {
                int counter = map.get(c);
                map.put(c, ++counter);
            } else {
                map.put(c, 1);
            }
        }
        return map;
    }

    public Integer largestNumber(Integer[] numbersMeetNumbers) {
        return Arrays.asList(numbersMeetNumbers).stream().mapToInt(value -> value).max().getAsInt();
    }
}
