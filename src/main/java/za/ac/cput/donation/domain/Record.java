package za.ac.cput.donation.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Record implements Serializable {
    @Id
    private long id;
    private String date;
    private String type;
    private boolean received;

    protected Record() { }

    private Record(Builder builder){
        this.id = builder.id;
        this.date = builder.date;
        this.type = builder.type;
        this.received = builder.received;
    }

    public long getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public String getType() {
        return type;
    }

    public boolean isReceived() {
        return received;
    }

    public static class Builder {
        private long id;
        private String date, type;
        private boolean received;

        public Builder setId(long id){
            this.id = id;
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

        public Builder isReceived(boolean received){
            this.received = received;
            return this;
        }

        public Record build() {
            return new Record(this);
        }
    }

    @Override
    public String toString() {
        return "Record{" +
                "id=" + id +
                ", date='" + date + '\'' +
                ", type='" + type + '\'' +
                ", received=" + received +
                '}';
    }
}
