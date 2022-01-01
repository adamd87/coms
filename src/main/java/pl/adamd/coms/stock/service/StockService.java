package pl.adamd.coms.stock.service;

import pl.adamd.coms.stock.entity.Stock;

import java.util.List;

interface StockService {
    Stock save(Stock stock);

    List<Stock> findAll();
}
