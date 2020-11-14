package week9;

/**
 * @ClassName StudentTest
 * @Description TODO
 * @Author Z
 * @Date 2020/11/5
 **/

public class BookTest {
    public static void main(String[] args) {
        Book book1 = Book.builder().Price(101).build();
        BookService b1 = new BookServiceImpl();
        boolean flag = false;
        try {
            flag = b1.checkPrice(book1);
        } catch (PriceException e) {
            System.err.println(e.getMessage());
        }
        System.out.println(flag);
    }

}
