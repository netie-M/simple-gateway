package com.base;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class GatewayApplicationTest {

    @Value("${spring.application.name}")
    private String name;
    @Test
    public void test(){
        System.out.println(name);
    }
}