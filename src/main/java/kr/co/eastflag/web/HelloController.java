package kr.co.eastflag.web;

import kr.co.eastflag.web.dto.HelloDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/hello/dto")
    public HelloDto helloDto(@RequestParam("name") String name, @RequestParam("amount") Integer amount) {
        return new HelloDto(name, amount);
    }
}
