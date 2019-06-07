package com.lambdaschool.dogsinitial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@SpringBootApplication
public class DogsinitialApplication
{

    public static DogList ourDogList;
    public static void main(String[] args)
    {
        ourDogList = new DogList();
        SpringApplication.run(DogsinitialApplication.class, args);
    }

}

