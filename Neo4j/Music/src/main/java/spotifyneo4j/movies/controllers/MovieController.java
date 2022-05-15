package spotifyneo4j.movies.controllers;
//https://neo4j.com/developer/example-project/
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spotifyneo4j.movies.domainClasses.Movie;
import spotifyneo4j.movies.repository.MovieRepository;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    MovieRepository movieRepository;

    public MovieController(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @GetMapping
    public Iterable<Movie> findAll() {
        return movieRepository.findAll();
    }

    @GetMapping("/{title}")
    public Movie getMovieByTitle(@PathVariable String title) {
        return movieRepository.getMovieByTitle(title);
    }

    @GetMapping("/search/{title}")
    public Iterable<Movie> findMovieByTitleLike(@PathVariable String title) {
        return movieRepository.findMovieByTitleLike(title);
    }
}
