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
        Movie remakeTwo= context.getBean("movie",Movie.class);

        Movie movie1 = context.getBean("movie1",Movie.class);
        Movie remakeTwo1= context.getBean("movie1",Movie.class);

        System.out.println(movie.getActor());
        System.out.println("Singleton");
        System.out.println(movie==remakeTwo);
        System.out.println("Prototype");
        System.out.println(movie1==remakeTwo1);

    }
}
