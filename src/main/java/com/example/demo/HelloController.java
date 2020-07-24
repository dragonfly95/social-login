package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("hello.do")
    public ResponseEntity<ResponseVO> hello() {
        return new ResponseEntity<ResponseVO>(new ResponseVO("Hello"), HttpStatus.OK);
    }
}
