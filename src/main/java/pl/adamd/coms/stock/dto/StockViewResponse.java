package pl.adamd.coms.stock.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.adamd.coms.stock.enums.ProductType;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StockViewResponse {

    private Long id;
    private String name;
    private ProductType type;
    private BigDecimal count;
    private BigDecimal price;
    private LocalDate deliveryDate;
    private LocalDate expirationDate;
    private BigDecimal tax;
    private BigDecimal totalCost;
}
