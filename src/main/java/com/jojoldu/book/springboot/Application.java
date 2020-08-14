package com.jojoldu.book.springboot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.
        SpringBootApplication;
@SpringBootApplication
public class Application { // 앞으로 만들 프로젝트의 메인 클래스
    // 이 프로젝트는 항상 프로젝트의 최상단에 위치해야한다.
    // springboot에서는 외장WAS(tomcat) 말고 내장WAS를 선호한다 -> 어느 환경에서나 스프링부트를 배포 할 수 있기 때문에
    public static void main(String[] args){
        SpringApplication.run(Application.class,args);
    }

}
