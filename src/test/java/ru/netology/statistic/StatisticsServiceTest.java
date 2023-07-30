package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

public class StatisticsServiceTest {


    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }


//    @Test
//    void truthfulnessFinMax() {
//        StatisticsService service = new StatisticsService();
//
//        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
//
//        int numberOfMaximumPositions = 0;
//        long currentMax = incomesInBillions[0];
//        for (long income : incomesInBillions) {
//            if (currentMax < income) {
//                currentMax = income;
//
//            }
//            for (int i = 0; i < incomesInBillions.length; i++) {
//                if (incomesInBillions[i] == currentMax) {
//                    numberOfMaximumPositions++;
//                }
//            }
//        }
//        long expectedStationNumber = 0;
//        long actualStationNumber = service.findMax(incomesInBillions);
//        Assertions.assertEquals(expectedStationNumber, actualStationNumber);
//
//    }
//
//}
@Test
void findMaxOnTheBorder() {
    StatisticsService service = new StatisticsService();

    long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 20, 6, 11, 11, 25};
    long expected = 25;

    long actual = service.findMax(incomesInBillions);

    Assertions.assertEquals(expected, actual);
}

}
