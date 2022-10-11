package za.ac.cput.donation.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.donation.domain.Address;

import static org.junit.jupiter.api.Assertions.*;

class AddressFactoryTest {

    @Test
    void createAddress() {
        Address a = AddressFactory.createAddress(221,"11958","Long",8001);
        assertNotNull(a);
        assertEquals("Long", a.getStreetName());
        System.out.println(a);
    }
}