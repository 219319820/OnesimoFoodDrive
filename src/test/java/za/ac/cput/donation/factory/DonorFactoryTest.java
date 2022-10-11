package za.ac.cput.donation.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.donation.domain.Donor;

import static org.junit.jupiter.api.Assertions.*;

class DonorFactoryTest {

    @Test
    void createDonor() {
        Donor d = DonorFactory.createDonor("King", "Pin", "Kpin@gmail.com", "temppass");
        assertNotNull(d);
        assertEquals("Pin", d.getLastName());
        System.out.println(d);
    }
}