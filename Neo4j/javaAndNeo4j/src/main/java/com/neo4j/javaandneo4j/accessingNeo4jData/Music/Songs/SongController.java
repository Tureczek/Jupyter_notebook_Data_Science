package com.neo4j.javaandneo4j.accessingNeo4jData.Music.Songs;

import com.neo4j.javaandneo4j.accessingNeo4jData.Music.Artists.PersonService;
import com.neo4j.javaandneo4j.accessingNeo4jData.Person.Artist;
import com.neo4j.javaandneo4j.accessingNeo4jData.Person.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class SongController {


    @Autowired
    SongService songService;
    @Autowired
    PersonService personService;
    @Autowired
    ArtistRepository artistRepository;



    //http://localhost:8080/song?name=Chantaje
    @GetMapping("/song")
    public Song findSongByName(@RequestParam String name){
        return songService.findByName(name);
    }

    // http://localhost:8080/artist?name=Shakira
    @GetMapping("/artist")
    public Artist findArtistByName(@RequestParam String name){
        return personService.findByName(name);
    }

    // http://localhost:8080/test?name=Greg
    @GetMapping("/test")
    public Artist find(@RequestParam String name){
        return artistRepository.findByName(name);
    }
}
