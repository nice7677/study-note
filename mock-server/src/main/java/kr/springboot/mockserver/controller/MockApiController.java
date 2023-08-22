package kr.springboot.mockserver.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/loans")
public class MockApiController {

    @PostMapping("")
    public ResponseEntity<?> order() {
        return ResponseEntity.badRequest().build();
    }

}
