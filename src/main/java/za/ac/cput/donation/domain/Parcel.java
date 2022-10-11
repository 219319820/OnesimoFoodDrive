package za.ac.cput.donation.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Parcel implements Serializable {
    @Id
    private long id;
    private String description;
    private String date;
    private String type;
    private boolean status;

    protected Parcel(){}

    private Parcel(Builder builder){
        this.id = builder.id;
        this.description = builder.description;
        this.date = builder.date;
        this.type = builder.type;
        this.status = builder.status;
    }

    public static class Builder{
        private long id;
        private String description, date, type;
        private boolean status;

        public Builder setId(long id){
            this.id = id;
            return this;
        }

        public Builder setDescription(String description){
            this.description = description;
            return this;
        }

        public Builder setDate(String date){
            this.date = date;
            return this;
        }

        public Builder setType(String type){
            this.type = type;
            return this;
        }

        public Builder setStatus(boolean status){
            this.status = status;
            return this;
        }

        public Builder copy(Parcel parcel){
            this.id = parcel.id;
            this.description = parcel.description;
            this.date = parcel.date;
            this.type = parcel.type;
            this.status = parcel.status;
            return this;
        }

        public Parcel build(){
            return new Parcel(this);
        }

    }

    public long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getDate() {
        return date;
    }

    public String getType() {
        return type;
    }

    public boolean isStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Parcel{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", date='" + date + '\'' +
                ", type='" + type + '\'' +
                ", status=" + status +
                '}';
    }
}
