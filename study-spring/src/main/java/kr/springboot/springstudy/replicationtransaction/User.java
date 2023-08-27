package kr.springboot.springstudy.replicationtransaction;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
@Entity
public class User {

    @Id
    private String name;

    private Double balance;

    public void setBalance(double v) {
        this.balance = v;
    }
}
