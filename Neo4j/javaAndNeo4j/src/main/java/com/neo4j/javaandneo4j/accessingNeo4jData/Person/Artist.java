package com.neo4j.javaandneo4j.accessingNeo4jData.Person;

import com.neo4j.javaandneo4j.accessingNeo4jData.Music.Artists.Person;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.util.Collections;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@Node
public class Artist {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String role;

    public Artist(String name) {
        this.name = name;
    }

    /**
     * Neo4j doesn't REALLY have bi-directional relationships. It just means when querying
     * to ignore the direction of the relationship.
     * https://dzone.com/articles/modelling-data-neo4j
     */

    @Relationship(type = "COLLABORATED")
    public Set<Artist> collaborators;

    public void worksWith(Artist artist){
        if (collaborators == null){
            collaborators = new HashSet<>();
        }
        collaborators.add(artist);
    }

    public String toString() {

        return this.name + "'s teammates => "
                + Optional.ofNullable(this.collaborators).orElse(
                        Collections.emptySet()).stream()
                .map(Artist::getName)
                .collect(Collectors.toList());
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
