package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("file:src/beans.xml");
        Movie bean = context.getBean("movie", Movie.class);
        bean.print();
        bean.setApplicationContext(context);
        bean.setBeanName("pallavi");
    }
}
