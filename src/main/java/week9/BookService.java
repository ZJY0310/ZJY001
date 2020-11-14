package week9;

/**
 * @ClassName BookService
 * @Description TODO
 * @Author Z
 * @Date 2020/11/5
 **/

public interface BookService {
    boolean checkPrice(Book book) throws PriceException;
}

