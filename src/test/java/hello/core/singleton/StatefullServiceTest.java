package hello.core.singleton;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class StatefullServiceTest {

    @Test
    void statefulServiceSingleton(){
        ApplicationContext ac = new AnnotationConfigApplicationContext(TestConfig.class);
        StatefullService statefulService1 = ac.getBean(StatefullService.class);
        StatefullService statefulService2 = ac.getBean(StatefullService.class);



        int price = statefulService1.order("userA",10000);
        System.out.println("price = " + price);

        assertThat(statefulService1.order("userB",20000)).isEqualTo(20000);


    }

    static class TestConfig{

        @Bean
        public StatefullService statefulService(){
            return new StatefullService();
        }
    }

}
