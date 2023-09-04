package kr.springboot.springstudy.ddd.domainservice;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@DisplayName("OrderService 테스트")
class OrderServiceTest {

    @Nested
    @DisplayName("getDiscountPrice 메소드는")
    class Describe_getDiscountPrice {

        @Nested
        @DisplayName("주문 금액이 10000원 일 경우")
        class Context_with_order_10000 {

            @DisplayName("10% 할인 금액인 9000원을 반환한다.")
            @Test
            void it_get_discount_price() {

                OrderService orderService = new OrderService(new DiscountCalculationsService());
                Order order = new Order(10000);
                int discountPrice = orderService.getDiscountPrice(order);
                assertThat(discountPrice).isEqualTo(9000);

            }

        }

    }


}
