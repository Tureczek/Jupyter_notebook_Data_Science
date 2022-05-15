package spotifyneo4j;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@EnableTransactionManagement
@EnableNeo4jRepositories
@SpringBootApplication
public class SpotifyNeo4jApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpotifyNeo4jApplication.class, args);
    }

}
