package com.neo4j.javaandneo4j.accessingNeo4jData.Music;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;

public interface SongRepository extends Neo4jRepository<Song, Long> {

    Song findByNameEquals(@Param("name") String name);

}
