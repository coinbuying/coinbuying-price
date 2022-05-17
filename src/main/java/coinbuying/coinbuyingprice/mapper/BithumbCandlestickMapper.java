package coinbuying.coinbuyingprice.mapper;

import coinbuying.coinbuyingprice.vo.BithumbCandlestickDataResponse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BithumbCandlestickMapper {
    BithumbCandlestickMapper INSTANCE = Mappers.getMapper(BithumbCandlestickMapper.class);

    default BithumbCandlestickDataResponse doublesToResponse(double[] result) {
        BithumbCandlestickDataResponse response = new BithumbCandlestickDataResponse();
        response.setTime((int)result[0]);
        response.setStartPrice(result[1]);
        response.setEndPrice(result[2]);
        response.setHighPrice(result[3]);
        response.setMinPrice(result[4]);
        return response;
    }
}
