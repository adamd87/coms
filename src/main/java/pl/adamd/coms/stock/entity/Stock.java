package pl.adamd.coms.stock.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.adamd.coms.stock.enums.ProductType;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "stock")
public class Stock {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
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
