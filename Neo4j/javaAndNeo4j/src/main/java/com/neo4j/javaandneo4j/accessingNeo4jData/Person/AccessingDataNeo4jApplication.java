package com.neo4j.javaandneo4j.accessingNeo4jData.Person;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;

import java.util.Arrays;
import java.util.List;
/*
@SpringBootApplication
@EnableNeo4jRepositories
public class AccessingDataNeo4jApplication {

    private final static Logger log = LoggerFactory.getLogger(AccessingDataNeo4jApplication.class);

    public static void main(String[] args) throws Exception {
        SpringApplication.run(AccessingDataNeo4jApplication.class, args);
        System.exit(0);
    }
/*
    @Bean
    CommandLineRunner demo(ArtistRepository artistRepository) {
        return args -> {

           //artistRepository.deleteAll();

            Artist greg = new Artist("Greg");
            Artist roy = new Artist("Roy");
            Artist craig = new Artist("Craig");

            List<Artist> colab = Arrays.asList(greg, roy, craig);

            log.info("Before linking up with Neo4j...");

            colab.stream().forEach(artist -> log.info("\t" + artist.toString()));

            artistRepository.save(greg);
            artistRepository.save(roy);
            artistRepository.save(craig);

            greg = artistRepository.findByName(greg.getName());
            greg.worksWith(roy);
            greg.worksWith(craig);
            artistRepository.save(greg);

            roy = artistRepository.findByName(roy.getName());
            roy.worksWith(craig);
            // We already know that roy works with greg
            artistRepository.save(roy);

            // We already know craig works with roy and greg

            log.info("Lookup each person by name...");
            colab.stream().forEach(artist -> log.info(
                    "\t" + artistRepository.findByName(artist.getName()).toString()));

            List<Artist> collabs = artistRepository.findByCollaborators(greg.getName());
            log.info("The following have Greg as a collaborator...");
            collabs.stream().forEach(artist -> log.info("\t" + artist.getName()));
        };
    }

}
*/