package com.upbit.api.controller;

import com.upbit.api.service.UpbitApiService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@Slf4j
@RequiredArgsConstructor
@RestController
public class UpbitController {

    private final UpbitApiService upbitApiService;

    @RequestMapping(value = "/upbit-api/{ticker}", method = RequestMethod.GET)
    public List<?> getUpbitTickerPrice (@PathVariable  String ticker){
        return upbitApiService.getUpbitTickerList( ticker);
    }
}
