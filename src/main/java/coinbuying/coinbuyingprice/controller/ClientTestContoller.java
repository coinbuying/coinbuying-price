package coinbuying.coinbuyingprice.controller;

import coinbuying.coinbuyingprice.service.BithumbCandleService;
import coinbuying.coinbuyingprice.vo.BithumbCandlestickResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@RestController
public class ClientTestContoller {
    private final BithumbCandleService candleService;
    public ClientTestContoller(BithumbCandleService candleService) {
        this.candleService = candleService;
    }

    @GetMapping(value="/test", produces = MediaType.APPLICATION_JSON_VALUE)
    public Mono<BithumbCandlestickResponse> getBithumbCandlestick() {
        return candleService.getSyncCandleData("BTC", "KRW", "1m");
    }
}
