package kr.springboot.springstudy.ddd.domainservice;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Order {

    private Integer principal;

    public Order(Integer principal) {
        this.principal = principal;
    }

    public int calculate(DiscountCalculationsService discountCalculationsService) {
        int amount = discountCalculationsService.discount(principal, 10);
        return amount;
    }

}
