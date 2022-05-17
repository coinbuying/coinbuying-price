package coinbuying.coinbuyingprice.model;

import coinbuying.coinbuyingprice.entity.CoinPrice;
import coinbuying.coinbuyingprice.entity.CoinPriceHistory;
import coinbuying.coinbuyingprice.entity.CoinType;
import coinbuying.coinbuyingprice.entity.MarketType;

import java.time.LocalDateTime;
import java.util.List;

public interface CoinPriceFactory {
    CoinPrice CoinPriceBuilder(
            CoinType coinType,
            MarketType market,
            Double price,
            LocalDateTime dttm
    );
    List<CoinPrice> setupListBuilder();
}