package spotifyneo4j.movies.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import spotifyneo4j.movies.domainClasses.Movie;

public interface MovieRepository extends Neo4jRepository<Movie, Long> {

    Movie getMovieByTitle(String title);

    Iterable<Movie> findMovieByTitleLike(String title);
}
