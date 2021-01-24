package junit.tutorial.ch7;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BookStoreTest {

    @Test
    public void testGetTotalPrice() throws Exception {
        // SetUp
        BookStore bookStore = new BookStore();
        Book book = BookStoreTestHelper.createBook();
        bookStore.addToCart(book, 1);
        // Exercise & Verify
        assertThat(bookStore.getTotalPrice()).isEqualTo(4500);
    }

    @Test
    public void testGet() throws Exception {
        // SetUp
        BookStore bookStore = new BookStore();
        Book book = BookStoreTestHelper.createBook();
        bookStore.addToCart(book, 1);
        // Exercise & Verify
        assertThat(bookStore.get(0)).isSameAs(book);
    }
}
