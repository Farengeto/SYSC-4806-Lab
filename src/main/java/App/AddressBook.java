package App;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class AddressBook {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @OneToMany(cascade = CascadeType.PERSIST)
    private List<BuddyInfo> addresses;

    public AddressBook() {
        addresses = new ArrayList<BuddyInfo>();
    }

    public void addAddress(String name, String phoneNumber) {
        addAddress(new BuddyInfo(name, phoneNumber));
    }

    public void addAddress(BuddyInfo buddy) {
        addresses.add(buddy);
    }

    public void removeAddress(int index){
        addresses.remove(index);
    }

    public void printAddresses() {
        System.out.println("Address Book:");
        for (BuddyInfo b : addresses) {
            System.out.println(b.getInfo());
        }
    }

    public List<BuddyInfo> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<BuddyInfo> addresses) {
        this.addresses = addresses;
    }

    public BuddyInfo getAddress(int index) {
        return addresses.get(index);
    }

    public void setAddress(int index, BuddyInfo buddy) {
        addresses.set(index, buddy);
    }
}
