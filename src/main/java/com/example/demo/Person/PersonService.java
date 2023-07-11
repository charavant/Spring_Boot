package com.example.demo.Person;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class PersonService {
    private final PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }


    @GetMapping
    public List<Person> getPersons(){
       return personRepository.findAll();

    }

    public void addNewPerson(Person person) {
        Optional<Person> personByName = personRepository
                .findPersonByName(person.getName());
        if(personByName.isPresent()){
            throw new IllegalStateException("name already exists");
        }
        personRepository.save(person);
    }

    public void deletePerson(Long personId) {
        boolean exists= personRepository.existsById(personId);
        if (!exists){
            throw new IllegalStateException("person with id "+ personId +" does not exists");
        }
        personRepository.deleteById(personId);
    }

    @Transactional
    public void updatePerson(Long personId,
                             String name,
                             String details,
                             Long mobile) {
        Person person = personRepository.findById(personId)
                .orElseThrow(()-> new IllegalStateException(
                        "person with id "+ personId +" does not exists"));

        if (name != null && name.length()>0 && !Objects.equals(person.getName(),name)){
            person.setName(name);
        }
        if (details != null && details.length()>0 && !Objects.equals(person.getDetails(),details)){
            person.setName(details);
        }
        if (mobile != null && !Objects.equals(person.getMobile(),mobile)){
            Optional<Person> personOptional = personRepository.findPersonByMobile(mobile);
            if (personOptional.isPresent()){
                throw new IllegalStateException("phone taken");
            }
            person.setMobile(mobile);
        }
    }
}
