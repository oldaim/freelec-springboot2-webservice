package com.jojoldu.book.springboot.web.dto;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
@Getter
@RequiredArgsConstructor
public class HelloResponseDto {
      private final String name;
      private final int amount;
      // 의문점2 롬복을 사용하면 생성자가 @requiredArgsConstructor 에의해서 생성되는건가?
      // 그래서 따로 초기화를 하지 않아도 간단하게 코드작성이 가능하다 이말인가?
}
