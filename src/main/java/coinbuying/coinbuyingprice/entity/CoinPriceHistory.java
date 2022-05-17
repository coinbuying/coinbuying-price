package coinbuying.coinbuyingprice.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;

@Table(value="coin_price_history")
@AllArgsConstructor
@Getter
@Builder
public class CoinPriceHistory {
    @Id
    @Column(value="price_id")
    private Long priceId;

    @Column(value="ticker")
    private String ticker;

    @Column(value="market")
    private String market;

    @Column(value="start_price")
    private Double startPrice;

    @Column(value="end_price")
    private Double endPrice;

    @Column(value="min_price")
    private Double minPrice;

    @Column(value="max_price")
    private Double maxPrice;

    @Column(value = "candle_interval")
    private String candleInterval;

    @Column(value="update_dttm")
    private LocalDateTime updateDttm;
}