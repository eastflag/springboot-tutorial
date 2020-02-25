package kr.co.eastflag.web;

import kr.co.eastflag.service.PostsService;
import kr.co.eastflag.web.dto.PostsRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class PostsController {

    private final PostsService postsService;

    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostsRequestDto requestDto) {
        return postsService.save(requestDto);
    }
}
