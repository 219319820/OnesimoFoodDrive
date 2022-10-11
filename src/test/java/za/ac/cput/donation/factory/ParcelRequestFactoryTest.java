package za.ac.cput.donation.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.donation.domain.ParcelRequest;

import static org.junit.jupiter.api.Assertions.*;

class ParcelRequestFactoryTest {

    @Test
    void createParcelRequest() {
        ParcelRequest p = ParcelRequestFactory.createParcelRequest("2021-01-01",25, "Food", true);
        assertNotNull(p);
        assertEquals(25, p.getStudentId());
        System.out.println(p);
    }
}