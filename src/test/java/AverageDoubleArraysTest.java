import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AverageDoubleArraysTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void count() {
        //Given
        double expected = 3;
        //When
        double[] doubleArray ={2.5, 2.0, 2.5};
        AverageDoubleArrays doubleCount = new AverageDoubleArrays();

        //Then
        assertEquals(expected, doubleCount.count(doubleArray));
    }

    @Test
    void sum() {
        //Given
        double expected=7.02;
        //When
        double[] doubleArray = {2.52, 2.0, 2.5};
        AverageDoubleArrays doubleSum = new AverageDoubleArrays();
        //Then
        assertEquals(expected, doubleSum.sum(doubleArray));
    }

    @Test
    void average() {
        //Given
        double expected = 2.34;
        //When
        double[] doubleArray = {2.52, 2.0, 2.5};
        AverageDoubleArrays doubleAverage = new AverageDoubleArrays();
        //Then
        assertEquals(expected, doubleAverage.average(doubleArray));
    }
}