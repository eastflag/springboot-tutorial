package kr.co.eastflag.domain.posts;

import kr.co.eastflag.web.domain.posts.Posts;
import kr.co.eastflag.web.domain.posts.PostsRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PostsTest {
    @Autowired
    PostsRepository postsRepository;

    @Test
    public void save() {
        String title = "테스트 게시물";
        String content ="게시판 본문";
        String author = "eastflag";

        Posts posts = Posts.builder()
                .title(title)
                .content(content)
                .author(author)
                .build();
        postsRepository.save(posts);

        List<Posts> postsList = postsRepository.findAll();
        Posts posts1 = postsList.get(0);
        assertThat(posts1.getTitle()).isEqualTo(title);
        assertThat(posts1.getContent()).isEqualTo(content);
    }

    @Test
    public void audit_test() {
        LocalDateTime now = LocalDateTime.of(2019, 6,4,0,0,0);

        String title = "테스트 게시물";
        String content ="게시판 본문";
        String author = "eastflag";
        Posts posts = Posts.builder()
                .title(title)
                .content(content)
                .author(author)
                .build();
        postsRepository.save(posts);

        List<Posts> postsList = postsRepository.findAll();
        System.out.println(postsList.get(0).getCreatedDate().toString());
        System.out.println(postsList.get(0).getModifiedDate().toString());
    }

}
