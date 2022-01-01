package pl.adamd.coms.stock.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.adamd.coms.stock.dto.StockCreateRequest;
import pl.adamd.coms.stock.dto.StockViewResponse;
import pl.adamd.coms.stock.service.StockViewService;

import java.util.List;


@RestController
@RequestMapping("/api/stock")
@AllArgsConstructor
class StockController {
    private final StockViewService stockViewService;

    @PostMapping
    ResponseEntity<StockViewResponse> addNewProduct(@RequestBody StockCreateRequest newProduct){
        return ResponseEntity.ok(stockViewService.createNewProduct(newProduct));
    }

    @GetMapping
    ResponseEntity<List<StockViewResponse>> getAllProducts(){
        return ResponseEntity.ok(stockViewService.getAll());
    }
}
