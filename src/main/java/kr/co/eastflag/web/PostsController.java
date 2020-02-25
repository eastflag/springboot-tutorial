package kr.co.eastflag.web;

import kr.co.eastflag.service.PostsService;
import kr.co.eastflag.web.dto.PostsRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class PostsController {

    private final PostsService postsService;

    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostsRequestDto requestDto) {
        return postsService.save(requestDto);
    }

    @PutMapping("/api/v1/posts/{id}")
    public Long update(@PathVariable Long id, @RequestBody PostsRequestDto postsRequestDto) {
        return postsService.update(id, postsRequestDto);
    }

    @GetMapping("/api/v1/posts/{id}")
    public PostsRequestDto findOne(@PathVariable Long id) {
        return postsService.findById(id);
    }

    @DeleteMapping("/api/v1/posts/{id}")
    public Long delete(@PathVariable Long id) {
        return postsService.delete(id);
    }
}
