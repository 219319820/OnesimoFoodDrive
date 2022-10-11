package za.ac.cput.donation.factory;

import za.ac.cput.donation.domain.Address;
import za.ac.cput.donation.util.Helper;

public class AddressFactory {
    public static Address createAddress(long id, String streetNumber, String streetName, int postalCode){
        if(Helper.isValid(id) && Helper.isValid(streetNumber) && Helper.isValid(streetName) && Helper.isValid(postalCode))
            return new Address.Builder().setId(id).setStreetNumber(streetNumber).setStreetName(streetName)
                    .setPostalCode(postalCode).build();
        return null;
    }
}
