package pl.adamd.coms.stock.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.adamd.coms.stock.dto.StockCreateRequest;
import pl.adamd.coms.stock.dto.StockViewResponse;
import pl.adamd.coms.stock.entity.Stock;
import pl.adamd.coms.stock.mapper.StockMapper;

import java.math.RoundingMode;
import java.util.List;

@Service
@AllArgsConstructor
class StockViewServiceImpl implements StockViewService {
    private final StockService stockService;
    private final StockMapper stockMapper;

    @Override
    public StockViewResponse createNewProduct(final StockCreateRequest enteredProduct) {

        Stock newProduct = Stock.builder()
                .name(enteredProduct.getName())
                .type(enteredProduct.getType())
                .count(enteredProduct.getCount())
                .price(enteredProduct.getPrice())
                .deliveryDate(enteredProduct.getDeliveryDate())
                .expirationDate(enteredProduct.getExpirationDate())
                .tax(enteredProduct.getTax())
                .totalCost(enteredProduct
                        .getPrice()
                        .multiply(enteredProduct.getTax())
                        .multiply(enteredProduct.getCount()).setScale(2, RoundingMode.HALF_UP))
                .build();

        stockService.save(newProduct);

        return stockMapper.stockEntityToDto(newProduct);
    }

    @Override
    public List<StockViewResponse> getAll() {
        return stockMapper.stockEntityListToDto(stockService.findAll());
    }
}
