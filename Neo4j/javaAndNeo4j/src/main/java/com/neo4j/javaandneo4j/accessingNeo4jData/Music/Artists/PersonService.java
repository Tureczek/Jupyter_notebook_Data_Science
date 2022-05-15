package com.neo4j.javaandneo4j.accessingNeo4jData.Music.Artists;

import com.neo4j.javaandneo4j.accessingNeo4jData.Person.Artist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PersonService {

    @Autowired
    PersonRepository personRepository;

    @Transactional(readOnly = true)
    public Artist findByName(String name){
        Artist result = personRepository.findByName(name);

        return result;
    }

    public Person saveOrUpdate(Person person){
        personRepository.save(person);
        return person;
    }

}
