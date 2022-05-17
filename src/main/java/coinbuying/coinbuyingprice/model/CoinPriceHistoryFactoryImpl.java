package coinbuying.coinbuyingprice.model;

import coinbuying.coinbuyingprice.entity.CoinType;
import coinbuying.coinbuyingprice.entity.MarketType;
import coinbuying.coinbuyingprice.entity.CoinPriceHistory;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@Component
public class CoinPriceHistoryFactoryImpl implements CoinPriceHistoryFactory {
    @Override
    public CoinPriceHistory CoinPriceHistoryBuilder(CoinType coinType, MarketType market, Double startPrice, Double endPrice,
                                             Double min_price, Double max_price, String candleInterval, LocalDateTime updateDttm) {
        return CoinPriceHistory.builder()
                .ticker(coinType.getTicker())
                .market(market.getName())
                .startPrice(startPrice)
                .endPrice(endPrice)
                .minPrice(min_price)
                .maxPrice(max_price)
                .candleInterval(candleInterval)
                .updateDttm(updateDttm).build();
    }

    @Override
    public List<CoinPriceHistory> setupListBuilder() {
        return Arrays.asList(
                CoinPriceHistoryBuilder(CoinType.BTC, MarketType.BITHUMB, 100.0, 200.0, 50.0, 250.0, "5m", LocalDateTime.now())
        );
    }
}
