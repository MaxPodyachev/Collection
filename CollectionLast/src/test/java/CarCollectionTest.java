import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarCollectionTest {

    private CarCollection carCollection;

    @Before
    public void setUp() throws Exception {
        carCollection = new CarArrayList();
        for (int i = 0; i < 100; i++) {
            carCollection.add(new Car("Brand" + i, i));
        }
    }

    @Test
    public void contains() {
        assertEquals(100, carCollection.size());
        assertTrue(carCollection.add(new Car("BMW", 1)));
        assertTrue(carCollection.contains(new Car("BMW", 1)));
        assertEquals(101, carCollection.size());
    }


}