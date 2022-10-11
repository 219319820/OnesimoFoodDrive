package za.ac.cput.donation.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Donor extends User implements Serializable {

    public Donor() {}
    private Donor(Builder builder){
        super();
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.email = builder.email;
        this.password = builder.password;
        if(builder.id != 0){
            this.id = builder.id;
        }
    }

    public static class Builder{
        private long id;
        private String firstName, lastName, email, password;

        public Builder setFirstName(String firstName){
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName){
            this.lastName = lastName;
            return this;
        }

        public Builder setEmail(String email){
            this.email = email;
            return this;
        }

        public Builder setPassword(String password){
            this.password = password;
            return this;
        }

        public Builder copy(Donor donor){
            this.id = donor.getId();
            this.firstName = donor.firstName;
            this.lastName = donor.lastName;
            this.email = donor.email;
            this.password = donor.password;
            return this;
        }

        public Donor build(){
            return new Donor(this);
        }
    }

    @Override
    public String toString() {
        return "Donor{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
