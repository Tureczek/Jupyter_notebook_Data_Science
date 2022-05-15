package com.neo4j.javaandneo4j.accessingNeo4jData.Music.Artists;

import com.neo4j.javaandneo4j.accessingNeo4jData.Person.Artist;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/*
@RepositoryRestResource(collectionResourceRel = "people", path = "people")
public interface PersonRepository extends PagingAndSortingRepository<Person, Long> {

    Person findByNameEquals(@Param("artist") String name);


}

 */

public interface PersonRepository extends Neo4jRepository<Person, Long> {

    Artist findByName(String name);

    List<Artist> findByCollaborators(String name);

    Person saveOrUpdate(Person person);
}