package com.jojoldu.book.springboot.web;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest

public class HelloControllerTest {
    @Autowired
    private MockMvc mvc; // 웹 API를 테스할떄 사용 합니다.
    @Test
    public void Hello가_리턴된다 () throws Exception{
        String hello ="hello";
        mvc.perform(get("/hello")) //HTTP GET 요청을 합니다.
                .andExpect(status().isOk())  //검증단계
                .andExpect(content().string(hello));//검증단계2
    }
    @Test
    public void HelloDto가_리턴된다 () throws Exception{
        String name ="hello";
        int amount =1000;
        mvc.perform(
                get("/hello/dto").param("name",name).param("amount",String.valueOf(amount)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name",is(name)))
                .andExpect(jsonPath("$.amount",is(amount)));


    }
}
