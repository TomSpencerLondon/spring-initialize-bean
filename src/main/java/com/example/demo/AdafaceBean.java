package com.example.demo;

import org.springframework.beans.factory.InitializingBean;

public class AdafaceBean implements InitializingBean {

    public AdafaceBean() {
        System.out.println("A");
    }

    public void initialize() {
        System.out.println("B");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("C");
    }
}
