package kr.springboot.springstudy.fixturemonkey;

import com.navercorp.fixturemonkey.FixtureMonkey;
import org.junit.jupiter.api.Test;

public class FixtureMonkeyTest {

    @Test
    void order() {

        final FixtureMonkey fixtureMonkey = FixtureMonkey.create();
        final Order order = fixtureMonkey.giveMeOne(Order.class);

        // given
        OrderService orderService = new OrderService();
        // when
        orderService.order(order);
        // then
    }


}
