package com.sprta.springauth.food;

import com.sprta.springauth.food.Food;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary // 같은 타입 Bean 여러개 있을 때 우선 주입
public class Chicken implements Food {
    @Override
    public void eat() {
        System.out.println("치킨을 먹습니다.");
    }
}