package vw.nama.springcontainer.di.configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

import vw.nama.springcontainer.di.model.*;

@Configuration
public class AppConfig {

    @Bean("firstBean")
    @DependsOn(value = {
        "secondBean1",
        "thirdBean"
    })
    public FirstBean firstBean() {
        return new FirstBean();
    }

    @Bean("secondBean1")
    public SecondBean secondBean1() {
        return new SecondBean();
    }
    
    @Bean("secondBean2")
    public SecondBean secondBean2() {
        return new SecondBean();
    }

    @Bean("thirdBean")
    public ThirdBean thirdBean() {
        return new ThirdBean();
    }
}