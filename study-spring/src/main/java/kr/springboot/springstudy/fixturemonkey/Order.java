package kr.springboot.springstudy.fixturemonkey;

import lombok.*;

@NoArgsConstructor
@Data
public class Order {

    String name;
    String address;
    String phoneNumber;

    public Order(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        validate(this);
    }

    private void validate(Order order) {
        if (order.name == null) {
            throw new IllegalArgumentException("이름이 없습니다.");
        }
        if (order.address == null) {
            throw new IllegalArgumentException("주소가 없습니다.");
        }
        if (order.phoneNumber == null) {
            throw new IllegalArgumentException("전화번호가 없습니다.");
        }
    }

}
