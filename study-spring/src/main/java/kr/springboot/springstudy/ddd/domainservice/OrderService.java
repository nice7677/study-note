package kr.springboot.springstudy.ddd.domainservice;

import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private final DiscountCalculationsService discountCalculationsService;

    public OrderService(DiscountCalculationsService discountCalculationsService) {
        this.discountCalculationsService = discountCalculationsService;
    }

    public int getDiscountPrice(Order order) {
        return order.calculate(discountCalculationsService);
    }

}
