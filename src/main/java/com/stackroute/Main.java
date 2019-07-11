package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import java.io.FileInputStream;

public class Main {
public static void main(String[] args)
{
/*
    Using XmlBeanFactory
*/
    BeanFactory factory=new XmlBeanFactory(new FileSystemResource("src/beans.xml"));
   Actor actor=factory.getBean("act",Actor.class);
   actor.display();
    Movie movie=factory.getBean("movie",Movie.class);
    movie.print();
/*
    Using ApplicationContext
*/
    ApplicationContext context=new ClassPathXmlApplicationContext("file:src/beans.xml");
    Movie movie2=context.getBean("movie",Movie.class);
    movie2.print();

/*
    Using BeanDefinitionRegistry and BeanDefinitionReader
*/
    BeanDefinitionRegistry beanFactory=new DefaultListableBeanFactory();
    XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(beanFactory);
    reader.loadBeanDefinitions(new FileSystemResource("src/beans.xml"));
    Movie movie3=((DefaultListableBeanFactory)beanFactory).getBean(Movie.class);
    movie3.print();
}
}
