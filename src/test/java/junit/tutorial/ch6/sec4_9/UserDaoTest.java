package junit.tutorial.ch6.sec4_9;

import junit.tutorial.ch6.UserDao;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

public class UserDaoTest {

    private UserDao userDao;

    @Rule
    public ImMemoryDbRule imMemoryDbRule = new ImMemoryDbRule();

    @Before
    public void setUp() throws Exception {
        userDao = new UserDao();
    }

    @Test
    public void testGetListReturns0() throws Exception {

    }
}
