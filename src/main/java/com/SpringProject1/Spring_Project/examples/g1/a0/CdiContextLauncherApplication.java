package com.SpringProject1.Spring_Project.examples.g1.a0;

import com.SpringProject1.Spring_Project.examples.c1.a0.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import jakarta.inject.Named;
import jakarta.inject.Inject;

//@Component
@Named
class BusinessService{
    private DataService dataService;


    //@Autowired
    @Inject
    public void setDataService(DataService dataService) {
        this.dataService = dataService;
    }

    public DataService getDataService() {
        System.out.println("Setter Injection");
        return dataService;
    }


}









@Configuration
@ComponentScan("com.SpringProject1.Spring_Project.examples")
public class CdiContextLauncherApplication {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(CdiContextLauncherApplication.class);
        {
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

            System.out.println(context.getBean(BusinessService.class).getDataService());


        }
    }

}
 