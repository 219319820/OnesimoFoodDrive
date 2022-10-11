package za.ac.cput.donation.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Donation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private long donorId;
    private String details;
    private String donationType;
    protected Donation(){}

    private Donation(Builder builder){
        this.donorId = builder.donorId;
        this.details = builder.details;
        this.donationType = builder.donationType;
    }

    public static class Builder{
        private long donorId;
        private String details, donationType;

        public Builder setDonorId(long donorId){
            this.donorId = donorId;
            return this;
        }

        public Builder setDetails(String details){
            this.details = details;
            return this;
        }

        public Builder setDonationType(String donationType){
            this.donationType = donationType;
            return this;
        }

        public Donation build(){
            return new Donation(this);
        }
    }

    public long getId() {
        return id;
    }

    public long getDonorId() {
        return donorId;
    }

    public String getDetails() {
        return details;
    }

    public String getDonationType() {
        return donationType;
    }

    @Override
    public String toString() {
        return "Donation{" +
                "id=" + id +
                ", donorId=" + donorId +
                ", details='" + details + '\'' +
                ", donationType='" + donationType + '\'' +
                '}';
    }
}
