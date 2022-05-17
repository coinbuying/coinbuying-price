package coinbuying.coinbuyingprice.scheduler;

import coinbuying.coinbuyingprice.service.BithumbCandleService;
import coinbuying.coinbuyingprice.vo.BithumbCandlestickResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

public class CoinPriceGetScheduler {
    private final BithumbCandleService candleService;

    public CoinPriceGetScheduler(BithumbCandleService candleService) {
        this.candleService = candleService;
    }

    @Scheduled(fixedRate = 1000)
    public void getBithumbCoinPrice() {
        candleService.getSyncCandleData("BTC", "KRW", "1m");
    }
}
