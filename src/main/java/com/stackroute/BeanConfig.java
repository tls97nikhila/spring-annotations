package com.stackroute;

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
    @Bean("movie")
    public Movie createMovie(){
        Movie movie= new Movie();
        movie.setActor(createActor());
        return movie;
    }
}
