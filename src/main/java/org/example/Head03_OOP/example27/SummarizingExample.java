package org.example.Head03_OOP.example27;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class SummarizingExample {
    public static void main(String[] args) {
        List<Integer> insScores = Arrays.asList(80,95,70,100,85);

        IntSummaryStatistics intSummaryStatistics = insScores.stream()
                .collect(Collectors.summarizingInt(Integer::intValue));

        System.out.println("Int Summary Count= " + intSummaryStatistics.getCount());
        System.out.println("Int Summary Sum = " + intSummaryStatistics.getSum());
        System.out.println("Int Summary Min= " +  intSummaryStatistics.getMin());
        System.out.println("Int Summary Max= " +  intSummaryStatistics.getMax());
        System.out.println("Int Summary Avg= " +  intSummaryStatistics.getAverage());
    }
}
