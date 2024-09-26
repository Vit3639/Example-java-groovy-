package org.example.java;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ElementCounter {
    private static final Logger logger = Logger.getLogger(ElementCounter.class.getName());

    public static Map<Integer, Integer> countElements(List<Integer> list) {
        Map<Integer, Integer> countMap = new HashMap<>();

        for (Integer element : list) {
            countMap.put(element, countMap.getOrDefault(element, 0) + 1);
        }

        return countMap;
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 3, 4, 5, 1, 5, 4);
        Map<Integer, Integer> result = countElements(numbers);
        logger.log(Level.INFO, "Результат: {0}", result);
    }
}