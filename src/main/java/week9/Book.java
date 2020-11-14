package week9;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName Bool
 * @Description TODO
 * @Author Z
 * @Date 2020/11/5
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Book {
    private String ISBN;
    private String BookName;
    private Integer Price;
}

