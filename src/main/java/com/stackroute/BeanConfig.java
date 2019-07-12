package com.stackroute;

import com.stackroute.Demo.BeanLifeCycle;
import com.stackroute.Demo.BeanPostProcessorDemoBean;
import com.stackroute.Domain.Actor;
import com.stackroute.Domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class BeanConfig {
    @Bean("actor")
    public Actor createActor(){
        Actor actor = new Actor();
        actor.setAge(12); actor.setGender("Female"); actor.setName("Naimisha");
        return actor;
    }


    @Bean(name = "movie")
    public Movie createMovie1(){
        Movie movie= new Movie();
        movie.setActor(createActor());
        return movie;
    }
    @Bean(initMethod="customInit", destroyMethod="customDestroy")
    public BeanLifeCycle getMyFileSystemBean() {
        return new BeanLifeCycle();
    }

    @Bean
    public BeanPostProcessorDemoBean getBean(){
        return new BeanPostProcessorDemoBean();
    }
}
