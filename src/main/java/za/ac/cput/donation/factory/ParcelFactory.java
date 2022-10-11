package za.ac.cput.donation.factory;

import za.ac.cput.donation.domain.Parcel;
import za.ac.cput.donation.util.Helper;

public class ParcelFactory {
    public static Parcel createParcel(long id, String description, String date, String type, boolean status){
        if(Helper.isValid(id) && Helper.isValid(description) && Helper.isValid(date) && Helper.isValid(type))
            return new Parcel.Builder().setId(id).setDescription(description).setDate(date)
                    .setType(type).setStatus(status).build();
        return null;
    }
}
