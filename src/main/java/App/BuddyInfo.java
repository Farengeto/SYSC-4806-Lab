package App;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class BuddyInfo {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String name;

    private String phoneNumber;

    public BuddyInfo() {
        this("","");
    }

    public BuddyInfo(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getInfo() {
        return name + " (" + phoneNumber + ")";
    }

    public String toString() {
        return name + " [" + phoneNumber + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof BuddyInfo) {
            BuddyInfo b = (BuddyInfo) o;
            return name.equals(b.getName()) && phoneNumber.equals(b.getPhoneNumber());
        }
        return false;
    }
}
