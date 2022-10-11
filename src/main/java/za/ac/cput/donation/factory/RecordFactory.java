package za.ac.cput.donation.factory;

import za.ac.cput.donation.domain.Record;
import za.ac.cput.donation.util.Helper;

public class RecordFactory {
    public static Record createRecord(long id, String date, String type, boolean isReceived){
        if(Helper.isValid(id) && Helper.isValid(date) && Helper.isValid(type))
            return new Record.Builder().setId(id).setDate(date).setType(type).isReceived(isReceived).build();
        return null;
    }
}
