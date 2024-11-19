package com.SpringProject1.Spring_Project.examples.d1.a0;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class ClassA{

}

@Component
class ClassB{
    private ClassA classA;
    public ClassB(ClassA classA){
        System.out.println("Some Initialization logic");
        this.classA=classA;
    }

    public void doSomething(){
        System.out.println("Do Something");
    }
}




@Configuration
@ComponentScan("com.SpringProject1.Spring_Project.examples.d1.a0")
public class LazyInitializationLaunchingApplication
{

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(LazyInitializationLaunchingApplication.class);
        {
            System.out.println("Initialization of COntext is Completed");
            context.getBean(ClassB.class).doSomething();
        }
    }

}
