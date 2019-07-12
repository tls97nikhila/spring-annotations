package com.stackroute;

import com.stackroute.Domain.Actor;
import com.stackroute.Domain.Movie;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeanConfig {
    @Bean("actor")
    public Actor createActor(){
        Actor actor = new Actor();
        actor.setAge(12); actor.setGender("Female"); actor.setName("Naimisha");
        return actor;
    }
    @Bean("movie2")
    @Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
    public Movie createMovie(){
        Movie movie= new Movie();
        movie.setActor(createActor());
        return movie;
    }


    @Bean(name = {"movie1","movie"})
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Movie createMovie1(){
        Movie movie= new Movie();
        movie.setActor(createActor());
        return movie;
    }
}
