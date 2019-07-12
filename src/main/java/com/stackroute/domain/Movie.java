package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Movie implements ApplicationContextAware, BeanNameAware , BeanFactoryAware {

    private Actor actor;
    private String movieName;
    private ApplicationContext context=null;
    private BeanFactory beanFactory=null;


    public void setActor(Actor actor) {
        this.actor = actor;
    }
    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public void print()
    {
        System.out.println("Movie name is"+movieName);
        System.out.println("Actors Details are");
        actor.display();

    }

    @Override
    public void setApplicationContext(ApplicationContext context) throws BeansException {
     this.context=context;
    }

    @Override
    public void setBeanName(String beanName) {
        System.out.println("Bean name is"+beanName);

    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory=beanFactory;
    }
}
