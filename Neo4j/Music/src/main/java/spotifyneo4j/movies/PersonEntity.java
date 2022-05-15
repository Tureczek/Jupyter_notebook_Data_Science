package spotifyneo4j.movies;

import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Node("Person")
public class PersonEntity {
    @Id
    private final String name;
    private final Integer born;

    public PersonEntity(String name, Integer born) {
        this.name = name;
        this.born = born;
    }

    public String getName() {
        return name;
    }

    public Integer getBorn() {
        return born;
    }
}
