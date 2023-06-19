package com.sparta.springauth;

import com.sparta.springauth.food.Food;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BeanTest {

    @Autowired
    @Qualifier("Pizza") // Qualifier는 주입받고자 하는 곳에 반드시 붙여줘야함
    Food food;
    // Food pizza;
    //Autowired는 우선 Bean 타입으로 DI를 찾지만, 연결이 되지 않는 경우 객체 이름으로 찾음
    // @Autowired
    // Food chicken;
    // food타입 Bean객체가 1개 이상인 경우 자동으로 등록해줄 수 없음
    // 1. 등록이 된 Bean객체 이름을 명시해준다.
    // 2.@Primary 가 붙어있는  Bean객체를 우선적으로 실행
    // 3. @Qualifier("name") 어노테이션 사용하면 주입할 수 있음
    // => Primary와 Qualifier 중 우선순위는 Qualifier!
    // 범용적으로 사용되는 Bean객체는 Primary
    // 지역적으로 사용되는 Bean객체는 Qualifier

    @Test
    @DisplayName("테스트")
    void test1(){
        food.eat();
    }
}
