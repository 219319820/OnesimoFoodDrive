package za.ac.cput.donation.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ParcelRequest {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String date;
    private String donationType;
    private long studentId;
    private boolean isReceived;

    public ParcelRequest(){}

    private ParcelRequest(Builder builder){
        this.date = builder.date;
        this.studentId = builder.studentId;
        this.donationType = builder.donationType;
        this.isReceived = builder.isReceived;
        if(builder.id > 0)
            this.id = builder.id;
    }

    public static class Builder{
        private long id;
        private String date, donationType;
        private long studentId;
        private boolean isReceived;

        public Builder setDate(String date){
            this.date = date;
            return this;
        }

        public Builder setStudentId(long studentId){
            this.studentId = studentId;
            return this;
        }

        public Builder setDonationType(String donationType){
            this.donationType = donationType;
            return this;
        }

        public Builder setIsReceived(boolean isReceived){
            this.isReceived = isReceived;
            return this;
        }

        public Builder copy(ParcelRequest parcelRequest){
            this.id = parcelRequest.id;
            this.date = parcelRequest.date;
            this.studentId = parcelRequest.studentId;
            this.donationType = parcelRequest.donationType;
            this.isReceived = parcelRequest.isReceived;
            return this;
        }

        public ParcelRequest build(){
            return new ParcelRequest(this);
        }
    }

    public long getId() {
        return id;
    }

    public String getDate() {
        return date;
    }
    public long getStudentId() {
        return studentId;
    }

    public String getDonationType() {
        return donationType;
    }

    public boolean isReceived() {
        return isReceived;
    }

    @Override
    public String toString() {
        return "ParcelRequest{" +
                "id=" + id +
                ", date='" + date + '\'' +
                ", donationType='" + donationType + '\'' +
                ", studentId=" + studentId +
                ", isReceived=" + isReceived +
                '}';
    }
}
