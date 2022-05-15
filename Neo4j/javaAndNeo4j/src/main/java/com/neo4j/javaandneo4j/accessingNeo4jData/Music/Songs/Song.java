package com.neo4j.javaandneo4j.accessingNeo4jData.Music.Songs;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.neo4j.core.schema.*;

@Node
public class Song {

    @Id
    @GeneratedValue
    private Long id;


    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
