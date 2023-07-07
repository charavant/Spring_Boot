package com.example.demo.Person;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/person")
public class PersonController {
    @GetMapping
    public List<Person> getPersons(){
        return List.of(
                new Person(
                        1L,
                        "Χαράλαμπος Αραβαντινός Καρλάτος",
                        27,
                        LocalDate.of(2023, Month.JULY,7),
                        6,
                        "test",
                        6951731317L,
                        "Νεαπόλεως 2,Νέα Σμύρνη"
                )
        );

    }
}