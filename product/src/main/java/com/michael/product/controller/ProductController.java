package com.michael.product.controller;

import com.michael.common.util.ResultMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 * @Package: com.michael.product.controller
 * @ClassName: ProductController
 * @Author: michael
 * @Date: 23:09
 * @Description: TODO
 */
@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/purchase/{userId}/{productId}/{amount}")
    public ResultMessage purchaseProduct(
            @PathVariable("userId") Long userId,
            @PathVariable("productId") Long productId,
            @PathVariable("amount") Double amount
    ) {
        System.out.println("扣除产品余额");
        String url = "http://FUND/fund//account/balance/{userId}/{amount}";
        Map<String,Object> param = new HashMap<>();
        param.put("userId", userId);
        param.put("amount", amount);
        // 请求资金微服务
        ResultMessage rm = restTemplate.postForObject(url, param, ResultMessage.class);
        // 打印资金微服务返回结果
        System.out.println(rm.getMessage());
        System.out.println("记录交易信息");
        ResultMessage result = new ResultMessage("交易成功", true);
        return result;
    }
}
