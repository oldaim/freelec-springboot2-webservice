package com.jojoldu.book.springboot.web.dto;

import com.jojoldu.book.springboot.domain.posts.Posts;
import lombok.Getter;

@Getter
public class PostsResponseDto {
    private Long id;
    private String title;
    private String content;
    private String author;

    public PostsResponseDto(Posts entity){
        this.id =entity.getId();
        this.title =entity.getTitle();  // 이게 무슨 기능을 하는지 잘 모르겠다..1
        this.content=entity.getContent();// 이게 무슨 기능을 하는지 잘 모르겠다..2
        this.author=entity.getAuthor();// 이게 무슨 기능을 하는지 잘 모르겠다..3
    }
}
