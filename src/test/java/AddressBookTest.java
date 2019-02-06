import App.AddressBook;
import App.BuddyInfo;
import org.junit.Before;

import java.util.List;

import static org.junit.Assert.*;

public class AddressBookTest {

    private AddressBook addressBook;

    @org.junit.Test
    public void addAddress() {
        int count = addressBook.getAddresses().size();
        addressBook.addAddress("Luke Skywalker", "TK-421");
        List<BuddyInfo> addresses = addressBook.getAddresses();
        assertTrue(addresses.size() == count + 1);
    }

    @org.junit.Test
    public void addAddress1() {
        BuddyInfo newAddress = new BuddyInfo("Han Solo", "TK-710");
        addressBook.addAddress(newAddress);
        List<BuddyInfo> addresses = addressBook.getAddresses();
        assertTrue(addresses.contains(newAddress));
    }

    @org.junit.Test
    public void getAddresses() {
        List<BuddyInfo> addresses = addressBook.getAddresses();
        assertNotNull(addresses);
    }

    @org.junit.Test
    public void printAddresses() {
        addressBook.printAddresses();
    }

    @Before
    public void setUp() {
        addressBook = new AddressBook();
    }
}