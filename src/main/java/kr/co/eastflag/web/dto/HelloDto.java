package kr.co.eastflag.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
//@RequiredArgsConstructor
public class HelloDto {

    private final String name;
    private final int amount;

    public HelloDto(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }
}