package za.ac.cput.donation.factory;

import za.ac.cput.donation.domain.ParcelRequest;
import za.ac.cput.donation.util.Helper;

public class ParcelRequestFactory {
    public static ParcelRequest createParcelRequest(String date, long studentId, String donationType, boolean isReceived){
        if(Helper.isValid(date) && Helper.isValid(studentId) && Helper.isValid(donationType))
            return new ParcelRequest.Builder().setDate(date).setStudentId(studentId)
                    .setDonationType(donationType).setIsReceived(isReceived).build();
        return null;
    }
}
