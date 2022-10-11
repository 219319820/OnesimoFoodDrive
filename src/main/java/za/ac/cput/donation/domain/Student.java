package za.ac.cput.donation.domain;

import javax.persistence.Entity;
import java.io.Serializable;

@Entity
public class Student extends User implements Serializable {
    private boolean isFunded;

    public Student() {}

    private Student(Builder builder){
        super();
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.email = builder.email;
        this.password = builder.password;
        this.isFunded = builder.isFunded;
        if(builder.id != 0){
            this.id = builder.id;
        }
    }

    public static class Builder{
        private long id;
        private String firstName, lastName, email, password;
        private boolean isFunded;

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

        public Builder setIsFunded(boolean isFunded){
            this.isFunded = isFunded;
            return this;
        }

        public Builder copy(Student student){
            this.id = student.getId();
            this.firstName = student.firstName;
            this.lastName = student.lastName;
            this.email = student.email;
            this.password = student.password;
            this.isFunded = student.isFunded;
            return this;
        }

        public Student build(){
            return new Student(this);
        }
    }

    public boolean isFunded() {
        return isFunded;
    }

    @Override
    public String toString() {
        return "Student{" +
                "isFunded=" + isFunded +
                ", id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
