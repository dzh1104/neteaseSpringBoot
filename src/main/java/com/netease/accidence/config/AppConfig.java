package com.netease.accidence.config;

import com.netease.accidence.entity.Pet;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
// 配置类 等同于 spring-config.xml
public class AppConfig {
    
    @Bean
    // <bean id='pet2'>...</beac> id 就是 方法名
    public Pet pet2() {
    
        Pet pet = new Pet();
        pet.setNickname("小八");
        pet.setStrian("秋田犬");
        // <bean class="com.netease.accidence.entity.Pet">...</beac> class 就是 返回值类型
        return pet;
    }
}
