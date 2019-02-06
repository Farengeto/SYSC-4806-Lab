import App.AddressBook;
import App.BuddyInfo;
import org.junit.Test;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class JPATest {

    @Test
    public void testBuddyInfoPersistence() {

        // Creating objects representing some products
        List<BuddyInfo> buddies = new ArrayList<BuddyInfo>();
        buddies.add(new BuddyInfo("Luke Skywalker", "123-456-7890"));
        buddies.add(new BuddyInfo("Han Solo", "234-567-1300"));

        // Connecting to the database through EntityManagerFactory
        // connection details loaded from persistence.xml
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-test");

        EntityManager em = emf.createEntityManager();

        // Creating a new transaction
        EntityTransaction tx = em.getTransaction();

        tx.begin();

        // Persisting the product entity objects
        for (BuddyInfo b : buddies) {
            em.persist(b);
        }

        tx.commit();

        // Querying the contents of the database using JPQL query
        Query q = em.createQuery("SELECT b FROM App.BuddyInfo b");

        @SuppressWarnings("unchecked")
        List<BuddyInfo> results = q.getResultList();

        System.out.println("List of products\n----------------");

        assertEquals(buddies.size(), results.size());

        for (int i = 0; i < results.size(); i++) {

            System.out.println(results.get(i).getInfo());
            assertTrue(buddies.contains(results.get(i)));
        }

        // Closing connection
        em.close();

        emf.close();
    }

    @Test
    public void testAddressBookPersistence(){
        AddressBook addressBook = new AddressBook();
        addressBook.addAddress("Luke Skywalker", "123-456-7890");
        addressBook.addAddress("Han Solo", "234-567-1300");

        // Connecting to the database through EntityManagerFactory
        // connection details loaded from persistence.xml
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-test");

        EntityManager em = emf.createEntityManager();

        // Creating a new transaction
        EntityTransaction tx = em.getTransaction();

        tx.begin();

        // Persisting the product entity objects
        em.persist(addressBook);

        tx.commit();

        // Querying the contents of the database using JPQL query
        Query q = em.createQuery("SELECT a FROM App.AddressBook a");

        @SuppressWarnings("unchecked")
        List<AddressBook> results = q.getResultList();

        assertTrue(results.size() > 0);

        System.out.println("List of products\n----------------");

        for(AddressBook a : results ){
            a.printAddresses();
        }

        // Closing connection
        em.close();

        emf.close();

    }
}
