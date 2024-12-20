package com.SpringProject1.Spring_Project.examples.f1.a0;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;


@Component
class SomeClass{
    private SomeDependency someDependency;
    public SomeClass(SomeDependency someDependency){
        super();
        this.someDependency = someDependency;
        System.out.println("All depencies are ready");
    }


    @PostConstruct
    public void initializa(){
        someDependency.getReady();
    }

    @PreDestroy
    public void cleanup(){
        System.out.println("Cleanup");
    }

}


@Component
class SomeDependency{
    public void getReady(){
        System.out.println("Some logic using SomeDependency");
    }


}




@Configuration
@ComponentScan("com.SpringProject1.Spring_Project.examples.f1")
public class PrePostAnnotationsContextLauncherApplication {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(PrePostAnnotationsContextLauncherApplication.class);
        {
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }
    }

}
