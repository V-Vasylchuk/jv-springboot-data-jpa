package mate.academy.springboot.datajpa.dto.request;

import lombok.Getter;
import lombok.Setter;
import java.math.BigDecimal;

@Getter
@Setter
public class ProductRequestDto {
    private String title;
    private BigDecimal price;
    private Long categoryId;
}
