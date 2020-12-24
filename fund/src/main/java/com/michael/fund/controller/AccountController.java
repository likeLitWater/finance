package com.michael.fund.controller;

import com.michael.common.util.ResultMessage;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @Package: com.michael.fund.controller
 * @ClassName: AccountController
 * @Author: michael
 * @Date: 22:52
 * @Description: TODO
 */
@RestController
@RequestMapping("/fund")
public class AccountController {

    /**
     * 扣除用于账户资金
     * @param userId
     * @param amount
     * @param request
     * @return
     */
    @PostMapping("/account/balance/{userId}/{amount}")
    public ResultMessage deductingBalance(
            @PathVariable("userId") Long userId,
            @PathVariable("amount") Double amount,
            HttpServletRequest request) {
        String message = "端口：【" + request.getServerPort() + "】 扣减成功";
        ResultMessage result = new ResultMessage();
        return result;
    }
}
