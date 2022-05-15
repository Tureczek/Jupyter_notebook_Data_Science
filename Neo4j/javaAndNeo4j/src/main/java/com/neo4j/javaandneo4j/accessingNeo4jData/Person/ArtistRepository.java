package com.neo4j.javaandneo4j.accessingNeo4jData.Person;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import java.util.List;

public interface ArtistRepository extends Neo4jRepository<Artist, Long> {

    Artist findByName(String name);
    List<Artist> findByCollaborators(String name);
}
