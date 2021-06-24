package com.chris.epam;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @author ye830
 * @date 6/24/2021
 * Write a program to calculate the frequency of words in input string, Output after sorting keys in alphabetical order.
 * Assume input is : New to Python or choosing between Python 2 and Python 3? Read Python 2 or Python 3.
 * Then output should be:
 * 2:2
 * 3.:1
 * 3?:1
 * New:1
 * ...
 */
public class Question1 {
    public Map<String, Integer> calculation(String inputStr) {
        Map<String, Integer> result = new LinkedHashMap<>();
        if (StringUtils.isNotBlank(inputStr)) {
            List<String> wordList = Arrays.asList(inputStr.trim().split(" "));
            wordList.sort(Comparator.comparing(word -> word));
            for (String word : wordList) {
                result.computeIfAbsent(word, key -> 1);
            }
            return result;
        } else {
            throw new IllegalArgumentException("Input should not be blank");
        }
    }

    public static void main(String[] args) {
        String str = "New to Python or choosing between Python 2 and Python 3? Read Python 2 or Python 3.";
        Map<String, Integer> result = new Question1().calculation(str);
        for (Map.Entry item : result.entrySet()) {
            System.out.println(item.getKey() + ":" + item.getValue());
        }
    }
}
