package junit.tutorial.ch6.sec4_8;

import junit.tutorial.ch6.UserDao;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class UserDaoTest {

    private UserDao userDao;
    private InMemoryDb inMemoryDb;

    @Before
    public void setUp() throws Exception {
        inMemoryDb = new InMemoryDb();
        inMemoryDb.start();
        userDao = new UserDao();
    }

    @After
    public void tearDown() throws Exception {
        inMemoryDb.shutdownNow();
    }

    @Test
    public void testGetListReturns0() throws Exception {
        //TODO: not implemented yet
    }
}
