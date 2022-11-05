import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoadAndStoreTest {

    // write all these out too.

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void loadIntArrayFromFile() {
        //Given
        int expected = 0;
        //When
        LoadAndStore loader = new LoadAndStore();
        int[] cc = loader.loadIntArrayFromFile("./testIntegerData1.txt");
        //Then
        AverageIntArrays avga = new AverageIntArrays();

        int countcc = avga.count(cc);

        int sumcc = avga.sum(cc);

        int averagecc = avga.average(cc);
        System.out.println("CC Count "+countcc+" Sum "+ sumcc+" Avg "+averagecc);

        assertEquals(10, countcc);
        assertEquals(95, sumcc);
        assertEquals(9, averagecc);
    }

    @Test
    void loadIntegerArrayListFromFile() {
        assertEquals(null, "");
    }

    @Test
    void loaddoubleArrayFromFile() {
        assertEquals(null, "");
    }

    @Test
    void loadDoubleArrayListFromFile() {
        assertEquals(null, "");
    }

    @Test
    void loadStringArrayFromFile() {
        assertEquals(null, "");
    }

    @Test
    void loadStringArrayListFromFile() {
        assertEquals(null, "");
    }
}