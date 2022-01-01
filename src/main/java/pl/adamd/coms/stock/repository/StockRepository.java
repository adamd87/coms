package pl.adamd.coms.stock.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.adamd.coms.stock.entity.Stock;

@Repository
public interface StockRepository extends JpaRepository<Stock, Long> {
}
