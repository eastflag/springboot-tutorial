package kr.co.eastflag.domain.posts;

import kr.co.eastflag.web.domain.user.Role;
import org.junit.Test;

import java.util.Optional;

public class EnumTest {

    @Test
    public void test() {
        System.out.println(" " + Role.GUEST.ordinal());
        System.out.println(" " + Role.GUEST.name());
        System.out.println(" " + Role.GUEST.getKey());
    }

    @Test
    public void test2() {
        Optional<String> gender = Optional.of("MALE");
        String answer1 = "Yes";
        String answer2 = null;
        Optional<String> gender2 = Optional.ofNullable(null);

        System.out.println("Non-Empty Optional:" + gender);
        System.out.println("Non-Empty Optional: Gender value : " + gender.get());
        System.out.println("Non-Empty Optional: Gender value : " + gender.orElse("mail"));
        System.out.println("Non-Empty Optional: Gender value : " + gender.orElseThrow(() -> new IllegalArgumentException("error")));
        System.out.println("Empty Optional: " + Optional.empty());
        System.out.println("Non-Empty Optional: Gender value : " + gender2.get());
        System.out.println("Non-Empty Optional: Gender value : " + gender2.orElse("femail"));
//        System.out.println("Non-Empty Optional: Gender value : " + gender2.orElseThrow(() -> new IllegalArgumentException("error")));

        System.out.println("ofNullable on Non-Empty Optional: " + Optional.ofNullable(answer1));
        System.out.println("ofNullable on Empty Optional: " + Optional.ofNullable(answer2));

        // java.lang.NullPointerException
//        System.out.println("ofNullable on Non-Empty Optional: " + Optional.of(answer2));
    }

    @Test
    public void test3() {
        Optional<String> gender = Optional.of("MALE");

        String temp = gender.map(item -> item + " add")
                .orElse("abc");
        System.out.println(temp);
    }
}
