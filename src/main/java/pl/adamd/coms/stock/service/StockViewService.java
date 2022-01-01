package pl.adamd.coms.stock.service;

import pl.adamd.coms.stock.dto.StockCreateRequest;
import pl.adamd.coms.stock.dto.StockViewResponse;

import java.util.List;

public interface StockViewService {
    StockViewResponse createNewProduct(StockCreateRequest enteredProduct);

    List<StockViewResponse> getAll();
}
