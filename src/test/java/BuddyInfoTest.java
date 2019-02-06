import App.BuddyInfo;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BuddyInfoTest {

    private BuddyInfo buddyInfo;

    @Before
    public void setUp() throws Exception {
        buddyInfo = new BuddyInfo("Luke Skywalker","TK-421");
    }

    @Test
    public void getName() {
        assertEquals("Luke Skywalker",buddyInfo.getName());
    }

    @Test
    public void setName() {
        buddyInfo.setName("Han Solo");
        assertEquals("Han Solo",buddyInfo.getName());
    }

    @Test
    public void getPhoneNumber() {
        assertEquals("TK-421",buddyInfo.getPhoneNumber());
    }

    @Test
    public void setPhoneNumber() {
        buddyInfo.setPhoneNumber("TK-710");
        assertEquals("TK-710",buddyInfo.getPhoneNumber());
    }

    @Test
    public void testToString() {
        assertEquals("Luke Skywalker (TK-421)",buddyInfo.getInfo());
    }
}