package neoSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

// Running this with a neo4j database running

@EnableTransactionManagement
@EnableNeo4jRepositories
@SpringBootApplication
public class NeoSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(NeoSpringApplication.class, args);
    }

}
