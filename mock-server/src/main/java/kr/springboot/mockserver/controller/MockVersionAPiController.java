package kr.springboot.mockserver.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/loans/version/hana")
public class MockVersionAPiController {

    @GetMapping("/v1/inquiry")
    public ResponseEntity<?> inquiryV1() {
        return ResponseEntity.ok("version1");
    }

    @GetMapping("/v2/inquiry")
    public ResponseEntity<?> inquiryV2() {
        return ResponseEntity.ok("version2");
    }

}
