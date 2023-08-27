package kr.springboot.springstudy.fixturemonkey;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class OrderService {

    public void order(Order order) {
        // 주문 로직
        log.info("ORDER ::: {}", order.toString());

    }

}
