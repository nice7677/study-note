package kr.springboot.mockserver.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/loans/sc")
public class MockScApiController {

    @PostMapping("")
    public ResponseEntity<?> order() {
        return ResponseEntity.badRequest().build();
    }

    @PostMapping("/inquiry")
    public ResponseEntity<?> inquiry() {
        return ResponseEntity.badRequest().body("inquiry failed");
    }

    @PostMapping("/request")
    public ResponseEntity<?> request() {
        return ResponseEntity.ok().build();
    }

    @PostMapping("/cancel")
    public ResponseEntity<?> cancel() {
        return ResponseEntity.ok().build();
    }

    @PostMapping("/userConfirmation")
    public ResponseEntity<?> userConfirmation() {
        return ResponseEntity.ok("success");
    }



}
