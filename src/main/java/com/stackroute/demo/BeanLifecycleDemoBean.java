package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {
    String message;
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Destroy");

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Bean Properties are set");
    }
    public void customInit()
    {
        System.out.println("Bean Initialization");
    }
    public void customDestroy()
    {
        System.out.println("Bean Destruction");
    }
}
