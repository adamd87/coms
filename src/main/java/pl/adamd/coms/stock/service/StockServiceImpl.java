package pl.adamd.coms.stock.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.adamd.coms.core.exception.StockNotFoundException;
import pl.adamd.coms.stock.entity.Stock;
import pl.adamd.coms.stock.repository.StockRepository;

import java.util.List;

@Service
@AllArgsConstructor
class StockServiceImpl implements StockService {
    public final StockRepository stockRepository;

    @Override
    public Stock save(final Stock stock) {
        return stockRepository.save(stock);
    }

    @Override
    public List<Stock> findAll() {
        if (stockRepository.findAll().isEmpty()) {
            throw new StockNotFoundException();
        } else {
            return stockRepository.findAll();
        }
    }
}
