package com.stackroute;


import com.stackroute.Domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@ComponentScan (basePackages = "com.stackroute.Domain")
public class Main
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        Movie movie = context.getBean("movie",Movie.class);

        System.out.println(movie.getActor());


    }
}
