package spotifyneo4j.movies;
// https://neo4j.com/developer/spring-data-neo4j/


import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.util.HashSet;
import java.util.Set;

@Node("Movie")
public class MovieEntity {

    @Id
    private final String title;

    @Property("tagline")
    private final String description;

    @Relationship(type = "ACTED_IN", direction = Relationship.Direction.INCOMING)
    private Set<PersonEntity> actors = new HashSet<>();

    @Relationship(type = "DIRECTED", direction = Relationship.Direction.INCOMING)
    private Set<PersonEntity> directors = new HashSet<>();

    public MovieEntity(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Set<PersonEntity> getActors() {
        return actors;
    }

    public Set<PersonEntity> getDirectors() {
        return directors;
    }
}
