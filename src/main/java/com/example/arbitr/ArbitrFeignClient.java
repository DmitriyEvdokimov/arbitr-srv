package com.example.arbitr;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(url = "https://api.checko.ru/v2/legal-cases", name = "ghg")
public interface ArbitrFeignClient {

    @RequestMapping(method = RequestMethod.GET, value = "")
    String getDemo(
            @RequestParam String key,
            @RequestParam String inn,
            @RequestParam String ogrn
    );

}
