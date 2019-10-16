package com.rocky.harsh;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootJdbcApp {

    public static void main(String[] args){
        ApplicationContext ctx = SpringApplication.run(SpringBootJdbcApp.class);
        Daoimpl daoimpl = (Daoimpl) ctx.getBean("Daoimpl");
        System.out.println("no. of recs: " + daoimpl.getRowcount());
        System.out.println("App ready and running");


    }
}
