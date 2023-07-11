package com.example.demo.Person;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class PersonConfig {

    @Bean
    CommandLineRunner commandLineRunner(PersonRepository repository){
        return args ->{
            Person person1 = new Person(
                    1L,
                    "Χαράλαμπος Αραβαντινός Καρλάτος",
                    LocalDate.of(2001, JULY,7),
                    LocalDate.of(2023, JULY,7),
                    6,
                    "test",
                    6951731317L,
                    "Νεαπόλεως 2,Νέα Σμύρνη"
            );
            Person person2 = new Person(

                    "Χαράλαμπος Αραβαντινός Καρλάτος",
                    LocalDate.of(2000, JULY,7),
                    LocalDate.of(2020, JULY,7),
                    6,
                    "test",
                    6951731317L,
                    "Νεαπόλεως 2,Νέα Σμύρνη"
            );
            repository.saveAll(List.of(person1,person2));
        };


    }
}
