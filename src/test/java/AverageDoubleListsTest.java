import org.junit.jupiter.api.Test;

import java.text.DecimalFormat;

import static org.junit.jupiter.api.Assertions.*;

class AverageDoubleListsTest {

    @Test
    void count() {
        //Given
        double expected = 3.0;
        //When
        double[] doubleArray = {3.5, 3.0, 1.4};
        AverageDoubleArrays a = new AverageDoubleArrays();

        //Then
        assertEquals(expected, a.count(doubleArray));
    }

    @Test
    void sum() {
        //Given
        double expected = 7.9;
        //When
        double[] doubleArray = {3.5, 3.0, 1.4};
        AverageDoubleArrays a = new AverageDoubleArrays();

        //Then
        assertEquals(expected, a.sum(doubleArray));
    }

    @Test
    void average() {
        //Given
        double expected = 2.63;
        //When
        double[] doubleArray = {3.5, 3.0, 1.4};
        AverageDoubleArrays a = new AverageDoubleArrays();
        DecimalFormat df = new DecimalFormat("##,###.##");
        double result = a.average(doubleArray);
        //Then
        assertEquals(expected, df.format(result));
    }
}