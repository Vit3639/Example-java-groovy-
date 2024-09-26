package org.example.groovy

class Main {
    static void main(String[] args) {
        def numbers = [1, 3, 4, 5, 1, 5, 4]
        def result = countElements(numbers)
        println(result)
    }

    static def countElements(List<Integer> list) {
        def countMap = [:]

        list.each { element ->
            countMap[element] = (countMap[element] ?: 0) + 1
        }

        return countMap
    }
}
