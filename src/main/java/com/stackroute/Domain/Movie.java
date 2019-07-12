package com.stackroute.Domain;

import org.springframework.stereotype.Component;

@Component
public class Movie {

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "actor=" + actor +
                '}';
    }

    Actor actor;


}
