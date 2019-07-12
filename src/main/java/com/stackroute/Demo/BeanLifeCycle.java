package com.stackroute.Demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

    public class BeanLifeCycle implements InitializingBean, DisposableBean {
        @Override
        public void destroy() throws Exception {
            System.out.println("destroying the bean");

        }

        @Override
        public void afterPropertiesSet() throws Exception {
            System.out.println("Intializing the bean");
        }
        public void customInit(){
            System.out.println("Initialization");
        }
        public void customDestroy(){
            System.out.println("Destroy");
        }
    }

