package com.jojoldu.book.springboot.domain.posts;
import org.springframework.data.jpa.repository.JpaRepository;
public interface PostsRepository extends JpaRepository<Posts,Long> {
    // Entity 클래스와 Entity Repository는 함께 위치 해야한다.
    // domain 패키지에서 같이 관리함
}
