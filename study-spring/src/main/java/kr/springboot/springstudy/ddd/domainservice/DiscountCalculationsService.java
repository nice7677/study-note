package kr.springboot.springstudy.ddd.domainservice;

import org.springframework.stereotype.Service;

@Service
public class DiscountCalculationsService {

    public int discount(int price, int discountRate) {
        return price - (price * discountRate / 100);
    }

}
