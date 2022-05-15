package com.neo4j.javaandneo4j.accessingNeo4jData.Music.Artists;

import com.neo4j.javaandneo4j.accessingNeo4jData.Person.Artist;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.util.HashSet;
import java.util.Set;

@Node
public class Person {
    @Id @GeneratedValue private Long id;

    private String name;
    private String role;

    public Person(String name) {
        this.name = name;
    }

    @Relationship(type = "COLLABORATED")
    public Set<Person> collaborators;

    public void worksWith(Person person){
        if (collaborators == null){
            collaborators = new HashSet<>();
        }
        collaborators.add(person);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}