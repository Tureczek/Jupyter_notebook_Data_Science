package spotifyneo4j.Books;

import java.util.List;
import org.springframework.data.neo4j.core.schema.*;
//import org.neo4j.ogm.annotation.GeneratedValue;
//import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
//import org.neo4j.ogm.annotation.Relationship;

import java.util.List;

@NodeEntity
public class Author {

    @Id
    //@org.springframework.data.annotation.Id
    @GeneratedValue
    private Long id;


    private String name;

    @Relationship(type = "AUTHORED", direction = Relationship.Direction.INCOMING)
    private List books;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List getBooks() {
        return books;
    }

    public void setBooks(List books) {
        this.books = books;
    }

}
