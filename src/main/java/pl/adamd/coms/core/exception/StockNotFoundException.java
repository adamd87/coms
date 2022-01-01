package pl.adamd.coms.core.exception;

public class StockNotFoundException extends RuntimeException{
    public StockNotFoundException(){
        super("Assortment not found.");
    }
}
