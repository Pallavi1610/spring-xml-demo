package com.stackroute;

import com.stackroute.demo.BeanLifecycleDemoBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("file:src/beans.xml");
        BeanLifecycleDemoBean bean=context.getBean("beanlifecycle",BeanLifecycleDemoBean.class);
        System.out.println(bean.getMessage());
    }
}
