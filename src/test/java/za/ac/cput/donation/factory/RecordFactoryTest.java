package za.ac.cput.donation.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.donation.domain.Record;

import static org.junit.jupiter.api.Assertions.*;

class RecordFactoryTest {

    @Test
    void createRecord() {
        Record r = RecordFactory.createRecord(800, "2020/02/07", "xxx", true);
        assertNotNull(r);
        assertEquals("xxx", r.getType());
        System.out.println(r);
    }
}