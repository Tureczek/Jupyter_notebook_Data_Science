package neoSpring.accessingneo4jdatarest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

// localhost:8080/movie?title=The Matrix
@RestController
@RequestMapping("/")
public class MovieController {

    @Autowired
    MovieService movieService;

    @GetMapping("/movie")
    public Movie findByTitle(@RequestParam String title){
        return movieService.findByTitle(title);
    }

    @GetMapping("/movies")
    public Collection<Movie> findByTitleLike(@RequestParam String title){
        return movieService.findByTitleLike(title);
    }
    /*
    @GetMapping("/graph")
    public Map<String, Object> graph(@RequestParam(value = "limit",required = false) Integer limit) {
        return movieService.graph(limit == null ? 100 : limit);
    }*/


}
