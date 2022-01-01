package pl.adamd.coms.stock.mapper;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import pl.adamd.coms.stock.dto.StockViewResponse;
import pl.adamd.coms.stock.entity.Stock;

import java.util.List;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface StockMapper {

    StockViewResponse stockEntityToDto(Stock stock);

    List<StockViewResponse> stockEntityListToDto(List<Stock> stockList);
}
