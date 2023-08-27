package kr.springboot.springstudy.replicationtransaction;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Slf4j
@Service
public class TransferService {

    private final UserRepository userRepository;

    public void transfer(String from, String to, Double amount) {

        User fromUser = findByUserName(from);
        User toUser = findByUserName(to);

        fromUser.setBalance(fromUser.getBalance() - amount);
        toUser.setBalance(toUser.getBalance() + amount);

        save(fromUser);

        callApiSomething();

        save(toUser);

    }

    @Transactional
    public User findByUserName(String name) {
        return userRepository.findById(name).orElseThrow(() -> new IllegalArgumentException("존재하지 않는 사용자입니다."));
    }

    @Transactional
    public void save(User user) {
        userRepository.save(user);
    }

    public void callApiSomething() throws IllegalArgumentException{
//        try {
            log.info("call api something");
            throw new IllegalArgumentException(); // 일부러 익셉션 발생
//        } catch (IllegalArgumentException e) {
//            log.info("api 호출 실패");
//        }
    }

}
