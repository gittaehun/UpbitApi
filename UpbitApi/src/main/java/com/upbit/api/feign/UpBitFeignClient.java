package com.upbit.api.feign;

import com.upbit.api.config.Config;
import com.upbit.api.dto.UpbitTickerVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "UpbitFeign", url = "https://api.upbit.com/v1/ticker", configuration = Config.class )
public interface UpBitFeignClient {

    @RequestMapping(method = RequestMethod.GET)
    List<UpbitTickerVO> getUpBitTickerList(@RequestParam(value="markets") String markets);
}