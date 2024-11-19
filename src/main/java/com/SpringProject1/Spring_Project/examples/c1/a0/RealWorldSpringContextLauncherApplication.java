package com.SpringProject1.Spring_Project.examples.c1.a0;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan
public class RealWorldSpringContextLauncherApplication {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(RealWorldSpringContextLauncherApplication.class);
        {
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

            System.out.println(context.getBean(BusinessCalculationService.class).findMax());
            context.getBean(BusinessCalculationService.class).findMax();
        }
    }

}
