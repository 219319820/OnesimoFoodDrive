package za.ac.cput.donation.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.donation.domain.Parcel;
import static org.junit.jupiter.api.Assertions.*;

class ParcelFactoryTest {

    @Test
    void createParcel() {
        Parcel p = ParcelFactory.createParcel(12, "Groceries","2020-11-11","Food",true);
        assertNotNull(p);
        assertEquals("Food", p.getType());
        System.out.println(p);
    }
}