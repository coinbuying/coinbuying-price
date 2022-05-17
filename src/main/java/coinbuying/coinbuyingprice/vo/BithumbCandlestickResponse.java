package coinbuying.coinbuyingprice.vo;

import coinbuying.coinbuyingprice.mapper.BithumbCandlestickMapper;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Arrays;

@Getter
@Setter
@ToString
public class BithumbCandlestickResponse {
    private int status;
    private BithumbCandlestickDataResponse[] data;

    public void setData(double[][] result) {
        this.data = Arrays.stream(result)
                .map(BithumbCandlestickMapper.INSTANCE::doublesToResponse)
                .toArray(BithumbCandlestickDataResponse[]::new);
    }
}
