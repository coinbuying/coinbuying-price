package coinbuying.coinbuyingprice.service;

import coinbuying.coinbuyingprice.vo.BithumbCandlestickResponse;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class BithumbCandleServiceImpl implements BithumbCandleService{
    @Override
    public  Mono<BithumbCandlestickResponse> getSyncCandleData(String coin, String currency, String chartIntervals) {
        WebClient webClient = WebClient.create("https://api.bithumb.com/public/candlestick");
        return webClient.get()
                .uri("/"+ coin + "_" + currency + "/" + chartIntervals)
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .retrieve()
                .bodyToMono(BithumbCandlestickResponse.class).log();
    }
}
