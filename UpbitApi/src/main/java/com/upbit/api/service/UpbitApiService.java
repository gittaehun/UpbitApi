package com.upbit.api.service;

import com.upbit.api.dto.UpbitTickerVO;
import com.upbit.api.feign.UpBitFeignClient;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
@RequiredArgsConstructor
public class UpbitApiService{


   private final UpBitFeignClient upbitFeignClient;


    public List<UpbitTickerVO> getUpbitTickerList(String markets) {
        return upbitFeignClient.getUpBitTickerList(markets);
    }

}
