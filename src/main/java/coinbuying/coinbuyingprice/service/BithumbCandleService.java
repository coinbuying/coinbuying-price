package coinbuying.coinbuyingprice.service;

import coinbuying.coinbuyingprice.vo.BithumbCandlestickResponse;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

public interface BithumbCandleService {
    public Mono<BithumbCandlestickResponse> getSyncCandleData(String coin, String currency, String chartIntervals);
}
