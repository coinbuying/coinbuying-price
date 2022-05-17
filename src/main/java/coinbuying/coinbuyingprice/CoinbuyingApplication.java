package coinbuying.coinbuyingprice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class CoinbuyingApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoinbuyingApplication.class, args);
    }

}
