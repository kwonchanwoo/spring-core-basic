package hello.core;

import hello.core.member.MemoryMemberRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class))
public class AutoAppConfig {

/**
 *  기존 자동 빈 등록과 이름이 겹쳐서 에러가 발생 (default spring.main.allow-bean-definition-overriding=false)
 */
//    @Bean(name ="memoryMemberRepository")
//    MemoryMemberRepository memberRepository(){
//        return new MemoryMemberRepository();
//    }
}
