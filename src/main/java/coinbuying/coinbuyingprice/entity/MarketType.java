package coinbuying.coinbuyingprice.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum MarketType {
    BITHUMB("BITHUMB"),
    UPBIT("UPBIT"),
    NONE("NONE");

    private String name;
}
