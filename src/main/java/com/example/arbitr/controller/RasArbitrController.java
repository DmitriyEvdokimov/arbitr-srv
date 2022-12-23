package com.example.arbitr.controller;

import com.example.arbitr.ArbitrFeignClient;
import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@Data
public class RasArbitrController {
    private final ArbitrFeignClient feignClient;

    @RequestMapping("/arbitrSearch")
    public String arbitrSearchConroller(
            @RequestParam("inn") String inn,
            @RequestParam("ogrn") String ogrn,
            Model model) {

        String response = feignClient.getDemo("l2SYnJAw5ObhSnZo", inn, ogrn);
        model.addAttribute("result", response);

        return ("arbitrSearch");
    }

}












