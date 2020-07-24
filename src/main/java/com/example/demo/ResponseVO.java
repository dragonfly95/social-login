package com.example.demo;

public class ResponseVO {

    private String name;

    public ResponseVO(String hello) {
        this.name = hello;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
