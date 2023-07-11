package com.example.demo.Person;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PersonRepository
        extends JpaRepository<Person, Long> {

    //Select * From person Where name = ?
    @Query("SELECT p FROM Person p where p.name= ?1")
    Optional<Person> findPersonByName(String name);

    Optional<Person> findPersonByMobile(Long mobile);
}
