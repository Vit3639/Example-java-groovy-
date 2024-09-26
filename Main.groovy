package org.example.groovy

import org.slf4j.LoggerFactory

import java.util.logging.Logger

class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main)

    static void main(String[] args) {
        def numbers = [1, 3, 4, 5, 1, 5, 4]
        logger.info("Исходные числа: {}", numbers)

        def result = countElements(numbers)
        logger.info("Результат подсчета: {}", result)
    }

    static def countElements(List<Integer> list) {
        def countMap = [:]

        list.each { element ->
            countMap[element] = (countMap[element] ?: 0) + 1
            logger.debug("Элемент: {}. Текущий счет: {}", element, countMap[element])
        }

        return countMap
    }
}