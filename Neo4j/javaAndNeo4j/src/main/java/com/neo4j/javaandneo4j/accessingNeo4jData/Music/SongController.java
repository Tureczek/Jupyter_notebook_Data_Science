package com.neo4j.javaandneo4j.accessingNeo4jData.Music;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class SongController {


    @Autowired
    SongService songService;

    @GetMapping("/song")
    public Song findByName(@RequestParam String name){
        return songService.findByName(name);
    }
}
