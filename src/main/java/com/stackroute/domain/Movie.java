package com.stackroute.domain;

public class Movie {

    Actor actor;

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    String movieName;
    public void setActor(Actor actor) {
        this.actor = actor;
    }
    public void print()
    {
        System.out.println("Movie name is"+movieName);
        System.out.println("Actors Details are");
        actor.display();

    }

}
