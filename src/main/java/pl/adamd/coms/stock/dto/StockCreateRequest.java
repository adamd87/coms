package pl.adamd.coms.stock.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import pl.adamd.coms.stock.enums.ProductType;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StockCreateRequest {

    private String name;
    private ProductType type;
    private BigDecimal count;
    private BigDecimal price;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate deliveryDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate expirationDate;
    private BigDecimal tax;
}
