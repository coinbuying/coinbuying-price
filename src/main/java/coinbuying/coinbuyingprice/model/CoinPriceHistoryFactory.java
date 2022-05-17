package coinbuying.coinbuyingprice.model;

import coinbuying.coinbuyingprice.entity.CoinType;
import coinbuying.coinbuyingprice.entity.MarketType;
import coinbuying.coinbuyingprice.entity.CoinPriceHistory;

import java.time.LocalDateTime;
import java.util.List;

public interface CoinPriceHistoryFactory {
    CoinPriceHistory CoinPriceHistoryBuilder(
            CoinType coinType,
            MarketType market,
            Double startPrice,
            Double endPrice,
            Double min_price,
            Double max_price,
            String candleInterval,
            LocalDateTime updateDttm
    );
    List<CoinPriceHistory> setupListBuilder();
}