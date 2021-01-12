package junit.tutorial.ch6;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@Ignore
@RunWith(Enclosed.class)
public class UserDaoTest {

    public static class TableIsEmptyCase {
        UserDao userDao;

        @Before
        public void setUp() throws Exception {
            DbUtils.drop("users");
            userDao = new UserDao();
        }

        @Test
        public void testGetListReturns0() throws Exception {
            List<User> actual = userDao.getList();
            assertThat(actual).isNotNull();
            assertThat(actual.size()).isEqualTo(0);
        }
    }

    public static class TableContains100DataCase {

        UserDao userDao;

        @Before
        public void setUp() throws Exception {
            DbUtils.drop("users");
            DbUtils.insert("users", getClass().getResource("users.yml"));
            userDao = new UserDao();
        }

        @Test
        public void testGetListReturns100() throws Exception {
            List<User> actual = userDao.getList();
            assertThat(actual).isNotNull();
            assertThat(actual.size()).isEqualTo(100);
        }
    }
}
