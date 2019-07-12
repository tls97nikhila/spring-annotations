package com.stackroute;

import com.stackroute.Domain.Actor;
import com.stackroute.Domain.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeanConfig {

    @Autowired
    @Qualifier("actor") // by name
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
}
