package org.babylon.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FireApp {


    public static void main(String [] args){

        System.out.println("Initializing Spring Application");
        SpringApplication.run(FireApp.class, args);

    }

}
