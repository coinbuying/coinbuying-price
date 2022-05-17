package coinbuying.coinbuyingprice.model;

import coinbuying.coinbuyingprice.entity.CoinPrice;
import coinbuying.coinbuyingprice.entity.CoinPriceHistory;
import coinbuying.coinbuyingprice.entity.CoinType;
import coinbuying.coinbuyingprice.entity.MarketType;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@Component
public class CoinPriceFactoryImpl implements CoinPriceFactory {
    @Override
    public CoinPrice CoinPriceBuilder(CoinType coinType, MarketType market, Double price, LocalDateTime dttm) {
        return CoinPrice.builder()
                .ticker(coinType.getTicker())
                .market(market.getName())
                .price(price)
                .dttm(dttm).build();
    }

    @Override
    public List<CoinPrice> setupListBuilder() {
        return Arrays.asList(
                CoinPriceBuilder(CoinType.BTC, MarketType.BITHUMB, 100.0, LocalDateTime.now())
        );
    }
}
