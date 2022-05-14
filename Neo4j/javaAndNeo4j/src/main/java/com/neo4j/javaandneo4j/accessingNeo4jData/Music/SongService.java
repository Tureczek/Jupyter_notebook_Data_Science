package com.neo4j.javaandneo4j.accessingNeo4jData.Music;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SongService {

    @Autowired
    SongRepository songRepository;

    @Transactional(readOnly = true)
    public Song findByName(String name){
        Song result = songRepository.findByNameEquals(name);

        return result;
    }
}
