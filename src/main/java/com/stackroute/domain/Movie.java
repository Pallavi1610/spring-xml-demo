package com.stackroute.domain;

import java.util.List;

public class Movie {

   private List<Actor> actor;


    public Movie(List<Actor> actor, String movieName) {
        this.actor = actor;

    }

    public void print()
    {

        System.out.println("Actors Details are");
        for(Actor actor:actor) {
            actor.display();
        }

    }

}
