package za.ac.cput.donation.domain;

import javax.persistence.*;

@Entity
public class Address {
    @Id
    private long id;
    private String streetNumber;
    private String streetName;
    private int postalCode;

    public Address() { }

    public Address(Builder builder){
        this.streetNumber = builder.streetNumber;
        this.streetName = builder.streetName;
        this.postalCode = builder.postalCode;
        this.id = builder.id;
    }

    public static class Builder{
        private long id;
        private String streetNumber, streetName;
        private int postalCode;

        public Builder setId(long id){
            this.id = id;
            return this;
        }

        public Builder setStreetNumber(String streetNumber){
            this.streetNumber = streetNumber;
            return this;
        }

        public Builder setStreetName(String streetName){
            this.streetName = streetName;
            return this;
        }

        public Builder setPostalCode(int postalCode){
            this.postalCode = postalCode;
            return this;
        }

        public Builder copy(Address address){
            this.streetNumber = address.streetNumber;
            this.streetName = address.streetName;
            this.postalCode = address.postalCode;
            this.id = address.id;
            return this;
        }

        public Address build(){
            return new Address(this);
        }
    }

    public long getId() {
        return id;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public int getPostalCode() {
        return postalCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", streetNumber='" + streetNumber + '\'' +
                ", streetName='" + streetName + '\'' +
                ", postalCode=" + postalCode +
                '}';
    }
}
