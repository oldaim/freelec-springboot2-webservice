package com.jojoldu.book.springboot.web.dto;
import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;
public class HelloResponseDtoTest {
    @Test
    public void 롬복_기능_테스트(){
        //given
        String name ="Test";
        int amount =1000;

        //when
        HelloResponseDto dto =new HelloResponseDto(name,amount);

        //then
        assertThat(dto.getName()).isEqualTo(name); // 검중 메소드 assertj라는 테스트 검증 라이브러리의 검증 메소드
        assertThat(dto.getAmount()).isEqualTo(amount);// isEqualto에 있는 값과 assertthat의 값을 비교해서 같으면 성공
         // 의문점
        //HelloControllerTest에서는 andExpect를 사용하고 import를 여러가지 했었는데 왜 이자식은 이렇게 간단하게 되는지 모르겠네
    }
}
