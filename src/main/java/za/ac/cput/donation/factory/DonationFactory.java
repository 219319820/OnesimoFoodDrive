package za.ac.cput.donation.factory;

import za.ac.cput.donation.domain.Donation;
import za.ac.cput.donation.util.Helper;

public class DonationFactory {
    public static Donation createDonation(long donorId, String details, String donationType){
        if(Helper.isValid(donorId) && Helper.isValid(details) && Helper.isValid(donationType))
            return new Donation.Builder().setDonorId(donorId).setDetails(details)
                    .setDonationType(donationType).build();
        return null;
    }
}
