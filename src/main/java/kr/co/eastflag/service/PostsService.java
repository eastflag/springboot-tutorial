package kr.co.eastflag.service;

import kr.co.eastflag.web.domain.posts.Posts;
import kr.co.eastflag.web.domain.posts.PostsRepository;
import kr.co.eastflag.web.dto.PostsRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class PostsService {
    private final PostsRepository postsRepository;

    public Long save(PostsRequestDto requestDto) {
        return postsRepository.save(requestDto.toEntity()).getId();
    }

    @Transactional
    public Long update(Long id, PostsRequestDto requestDto) {
        Posts posts = postsRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("no data"));
        posts.update(requestDto.getTitle(), requestDto.getContent());

        // update 하는 부분이 없다.
        // 영속성 컨텍스트이므로 가능
        return id;
    }

    public PostsRequestDto findById(Long id) {
        Posts posts = postsRepository.findById(id).orElseThrow(() -> new IllegalArgumentException(""));
        return new PostsRequestDto(posts);
    }

    @Transactional(readOnly = true)
    public List<PostsRequestDto> findAllDesc() {
        return postsRepository.findAllDesc().stream().map(posts -> new PostsRequestDto(posts)).collect(Collectors.toList());
    }

    public Long delete(Long id) {
        postsRepository.deleteById(id);
        return id;
    }
}
