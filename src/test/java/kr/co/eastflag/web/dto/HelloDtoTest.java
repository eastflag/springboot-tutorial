package kr.co.eastflag.web.dto;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HelloDtoTest {

    @Test
    public void test() {
        String name = "test";
        int amount = 1000;

        HelloDto dto = new HelloDto(name, amount);

        System.out.println(dto.getName());

        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);
    }
}
