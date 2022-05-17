package coinbuying.coinbuyingprice.config;

import coinbuying.coinbuyingprice.entity.CoinPrice;
import coinbuying.coinbuyingprice.model.CoinPriceFactory;
import coinbuying.coinbuyingprice.model.CoinPriceHistoryFactory;
import coinbuying.coinbuyingprice.repository.CoinPriceRepository;
import io.r2dbc.spi.ConnectionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.r2dbc.connection.init.ConnectionFactoryInitializer;
import org.springframework.r2dbc.connection.init.ResourceDatabasePopulator;

@Configuration
public class R2dbcConfig {

    private final CoinPriceHistoryFactory priceHistoryFactory;
    private final CoinPriceFactory priceFactory;

    @Autowired
    public R2dbcConfig(CoinPriceFactory priceFactory, CoinPriceHistoryFactory userAssetFactory) {
        this.priceHistoryFactory = userAssetFactory;
        this.priceFactory = priceFactory;
    }

    @Bean
    public ConnectionFactoryInitializer dbInit(ConnectionFactory connectionFactory) {
        ConnectionFactoryInitializer init = new ConnectionFactoryInitializer();
        init.setConnectionFactory(connectionFactory);
        init.setDatabasePopulator(new ResourceDatabasePopulator(new ClassPathResource("schema.sql")));
        return init;
    }

    @Bean
    public CommandLineRunner dataInit(CoinPriceRepository coinPriceRepository) {
        return (args) -> {
            coinPriceRepository.saveAll(
                    priceFactory.setupListBuilder()
            ).blockLast();
        };
    }


}
