package spotifyneo4j.movies.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spotifyneo4j.movies.domainClasses.Person;
import spotifyneo4j.movies.repository.PersonRepository;

import java.util.List;

@RestController
@RequestMapping("/people")
public class PersonController {

    @Autowired
    PersonRepository personRepository;

    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @GetMapping
    public Iterable<Person> findAllPersons() { return personRepository.findAll(); }

    @GetMapping("/{name}")
    public Person getPersonByName(@PathVariable String name) {
        return personRepository.getPersonByName(name);
    }

    @GetMapping("/search/{name}")
    public Iterable<Person> findPersonByNameLike(@PathVariable String name) {
        return personRepository.findPersonByNameLike(name);
    }

    @GetMapping("/actanddirect")
    public List<Person> getPersonsWhoActAndDirect() {
        return personRepository.getPersonsWhoActAndDirect();
    }
}
