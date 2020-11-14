package week9;

import com.zjy.java.week6.Student;

/**
 * @ClassName StudentServiceImpl
 * @Description TODO
 * @Author Z
 * @Date 2020/11/5
 **/

public class BookServiceImpl implements BookService {
    @Override
    public boolean checkPrice(Book book) throws PriceException {
        if (book.getPrice() > 100) {
            throw new PriceException("价格超过100元");
        } else {
            return false;
        }
    }
}

