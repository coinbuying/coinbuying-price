package coinbuying.coinbuyingprice.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BithumbCandlestickDataResponse {
    private int time;
    private double startPrice;
    private double endPrice;
    private double highPrice;
    private double minPrice;
    private double volume;
}
